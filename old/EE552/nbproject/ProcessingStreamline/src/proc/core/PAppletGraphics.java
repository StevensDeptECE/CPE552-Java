package processing.core;

public class PAppletGraphics extends Convenience {
	PGraphics g;
  /**
   * ( begin auto-generated from pixels.xml )
   *
   * Array containing the values for all the pixels in the display window.
   * These values are of the color datatype. This array is the size of the
   * display window. For example, if the image is 100x100 pixels, there will
   * be 10000 values and if the window is 200x300 pixels, there will be 60000
   * values. The <b>index</b> value defines the position of a value within
   * the array. For example, the statement <b>color b = pixels[230]</b> will
   * set the variable <b>b</b> to be equal to the value at that location in
   * the array.<br />
   * <br />
   * Before accessing this array, the data must loaded with the
   * <b>loadPixels()</b> function. After the array data has been modified,
   * the <b>updatePixels()</b> function must be run to update the changes.
   * Without <b>loadPixels()</b>, running the code may (or will in future
   * releases) result in a NullPointerException.
   *
   * ( end auto-generated )
   *
   * @webref image:pixels
   * @see PApplet#loadPixels()
   * @see PApplet#updatePixels()
   * @see PApplet#get(int, int, int, int)
   * @see PApplet#set(int, int, int)
   * @see PImage
   */
  public int[] pixels;

	public PAppletGraphics(int x, int y, int w, int h,
												 int bgColor, String driver) {
		
	}

	/**
   * ( begin auto-generated from beginRecord.xml )
   *
   * Opens a new file and all subsequent drawing functions are echoed to this
   * file as well as the display window. The <b>beginRecord()</b> function
   * requires two parameters, the first is the renderer and the second is the
   * file name. This function is always used with <b>endRecord()</b> to stop
   * the recording process and close the file.
   * <br /> <br />
   * Note that beginRecord() will only pick up any settings that happen after
   * it has been called. For instance, if you call textFont() before
   * beginRecord(), then that font will not be set for the file that you're
   * recording to.
   *
   * ( end auto-generated )
   *
   * @webref output:files
   * @param renderer PDF or SVG
   * @param filename filename for output
   * @see PApplet#endRecord()
   */
  public PGraphics beginRecord(String renderer, String filename) {
    filename = insertFrame(filename);
    PGraphics rec = createGraphics(width, height, renderer, filename);
    beginRecord(rec);
    return rec;
  }


  /**
   * @nowebref
   * Begin recording (echoing) commands to the specified PGraphics object.
   */
  public void beginRecord(PGraphics recorder) {
    g = new ChainGraphics(g);
    g.beginDraw();
  }


 /**
   * ( begin auto-generated from endRecord.xml )
   *
   * Stops the recording process started by <b>beginRecord()</b> and closes
   * the file.
   *
   * ( end auto-generated )
  * @webref output:files
  * @see PApplet#beginRecord(String, String)
  */
  public void endRecord() {
    if (g instanceof ChainGraphics) {
			PGraphics recorder = g;
			g = g.getUnderlying();
      recorder.endDraw();
      recorder.dispose();
    }
  }


  /**
   * ( begin auto-generated from beginRaw.xml )
   *
   * To create vectors from 3D data, use the <b>beginRaw()</b> and
   * <b>endRaw()</b> commands. These commands will grab the shape data just
   * before it is rendered to the screen. At this stage, your entire scene is
   * nothing but a long list of individual lines and triangles. This means
   * that a shape created with <b>sphere()</b> function will be made up of
   * hundreds of triangles, rather than a single object. Or that a
   * multi-segment line shape (such as a curve) will be rendered as
   * individual segments.
   * <br /><br />
   * When using <b>beginRaw()</b> and <b>endRaw()</b>, it's possible to write
   * to either a 2D or 3D renderer. For instance, <b>beginRaw()</b> with the
   * PDF library will write the geometry as flattened triangles and lines,
   * even if recording from the <b>P3D</b> renderer.
   * <br /><br />
   * If you want a background to show up in your files, use <b>rect(0, 0,
   * width, height)</b> after setting the <b>fill()</b> to the background
   * color. Otherwise the background will not be rendered to the file because
   * the background is not shape.
   * <br /><br />
   * Using <b>hint(ENABLE_DEPTH_SORT)</b> can improve the appearance of 3D
   * geometry drawn to 2D file formats. See the <b>hint()</b> reference for
   * more details.
   * <br /><br />
   * See examples in the reference for the <b>PDF</b> and <b>DXF</b>
   * libraries for more information.
   *
   * ( end auto-generated )
   *
   * @webref output:files
   * @param renderer for example, PDF or DXF
   * @param filename filename for output
   * @see PApplet#endRaw()
   * @see PApplet#hint(int)
   */
  public PGraphics beginRaw(String renderer, String filename) {
    filename = insertFrame(filename);
    PGraphics rec = createGraphics(width, height, renderer, filename);
    g.beginRaw(rec);
    return rec;
  }



  /**
   * @nowebref
   * Begin recording raw shape data to the specified renderer.
   *
   * This simply echoes to g.beginRaw(), but since is placed here (rather than
   * generated by preproc.pl) for clarity and so that it doesn't echo the
   * command should beginRecord() be in use.
   *
   * @param rawGraphics ???
   */
  public void beginRaw(PGraphics rawGraphics) {
    g.beginRaw(rawGraphics);
  }


  /**
   * ( begin auto-generated from endRaw.xml )
   *
   * Complement to <b>beginRaw()</b>; they must always be used together. See
   * the <b>beginRaw()</b> reference for details.
   *
   * ( end auto-generated )
   *
   * @webref output:files
   * @see PApplet#beginRaw(String, String)
   */
  public void endRaw() {
    g.endRaw();
  }


  //////////////////////////////////////////////////////////////


  /**
   * ( begin auto-generated from loadPixels.xml )
   *
   * Loads the pixel data for the display window into the <b>pixels[]</b>
   * array. This function must always be called before reading from or
   * writing to <b>pixels[]</b>.
   * <br/><br/> renderers may or may not seem to require <b>loadPixels()</b>
   * or <b>updatePixels()</b>. However, the rule is that any time you want to
   * manipulate the <b>pixels[]</b> array, you must first call
   * <b>loadPixels()</b>, and after changes have been made, call
   * <b>updatePixels()</b>. Even if the renderer may not seem to use this
   * function in the current Processing release, this will always be subject
   * to change.
   *
   * ( end auto-generated )
   * <h3>Advanced</h3>
   * Override the g.pixels[] function to set the pixels[] array
   * that's part of the PApplet object. Allows the use of
   * pixels[] in the code, rather than g.pixels[].
   *
   * @webref image:pixels
   * @see PApplet#pixels
   * @see PApplet#updatePixels()
   */
  public void loadPixels() {
    g.loadPixels();
    pixels = g.pixels;
  }

 /**
   * ( begin auto-generated from updatePixels.xml )
   *
   * Updates the display window with the data in the <b>pixels[]</b> array.
   * Use in conjunction with <b>loadPixels()</b>. If you're only reading
   * pixels from the array, there's no need to call <b>updatePixels()</b>
   * unless there are changes.
   * <br/><br/> renderers may or may not seem to require <b>loadPixels()</b>
   * or <b>updatePixels()</b>. However, the rule is that any time you want to
   * manipulate the <b>pixels[]</b> array, you must first call
   * <b>loadPixels()</b>, and after changes have been made, call
   * <b>updatePixels()</b>. Even if the renderer may not seem to use this
   * function in the current Processing release, this will always be subject
   * to change.
   * <br/> <br/>
   * Currently, none of the renderers use the additional parameters to
   * <b>updatePixels()</b>, however this may be implemented in the future.
   *
   * ( end auto-generated )
   * @webref image:pixels
   * @see PApplet#loadPixels()
   * @see PApplet#pixels
   */
  public void updatePixels() {
    g.updatePixels();
  }

  /**
   * @nowebref
   * @param x1 x-coordinate of the upper-left corner
   * @param y1 y-coordinate of the upper-left corner
   * @param x2 width of the region
   * @param y2 height of the region
   */
  public void updatePixels(int x1, int y1, int x2, int y2) {
    g.updatePixels(x1, y1, x2, y2);
  }


  //////////////////////////////////////////////////////////////

  // EVERYTHING BELOW THIS LINE IS AUTOMATICALLY GENERATED. DO NOT TOUCH!
  // This includes the Javadoc comments, which are automatically copied from
  // the PImage and PGraphics source code files.

  // public functions for processing.core

  public PGL beginPGL() {
    return g.beginPGL();
  }


  public void endPGL() {
    g.endPGL();
  }


  public void flush() {
    g.flush();
  }


  public void hint(int which) {
    g.hint(which);
  }


  /**
   * Start a new shape of type POLYGON
   */
  public void beginShape() {
    g.beginShape();
  }


  /**
   * ( begin auto-generated from beginShape.xml )
   *
   * Using the <b>beginShape()</b> and <b>endShape()</b> functions allow
   * creating more complex forms. <b>beginShape()</b> begins recording
   * vertices for a shape and <b>endShape()</b> stops recording. The value of
   * the <b>MODE</b> parameter tells it which types of shapes to create from
   * the provided vertices. With no mode specified, the shape can be any
   * irregular polygon. The parameters available for beginShape() are POINTS,
   * LINES, TRIANGLES, TRIANGLE_FAN, TRIANGLE_STRIP, QUADS, and QUAD_STRIP.
   * After calling the <b>beginShape()</b> function, a series of
   * <b>vertex()</b> commands must follow. To stop drawing the shape, call
   * <b>endShape()</b>. The <b>vertex()</b> function with two parameters
   * specifies a position in 2D and the <b>vertex()</b> function with three
   * parameters specifies a position in 3D. Each shape will be outlined with
   * the current stroke color and filled with the fill color.
   * <br/> <br/>
   * Transformations such as <b>translate()</b>, <b>rotate()</b>, and
   * <b>scale()</b> do not work within <b>beginShape()</b>. It is also not
   * possible to use other shapes, such as <b>ellipse()</b> or <b>rect()</b>
   * within <b>beginShape()</b>.
   * <br/> <br/>
   * The P3D renderer settings allow <b>stroke()</b> and <b>fill()</b>
   * settings to be altered per-vertex, however the default P2D renderer does
   * not. Settings such as <b>strokeWeight()</b>, <b>strokeCap()</b>, and
   * <b>strokeJoin()</b> cannot be changed while inside a
   * <b>beginShape()</b>/<b>endShape()</b> block with any renderer.
   *
   * ( end auto-generated )
   * @webref shape:vertex
   * @param kind Either POINTS, LINES, TRIANGLES, TRIANGLE_FAN, TRIANGLE_STRIP, QUADS, or QUAD_STRIP
   * @see PShape
   * @see PGraphics#endShape()
   * @see PGraphics#vertex(float, float, float, float, float)
   * @see PGraphics#curveVertex(float, float, float)
   * @see PGraphics#bezierVertex(float, float, float, float, float, float, float, float, float)
   */
  public void beginShape(int kind) {
    g.beginShape(kind);
  }


  /**
   * Sets whether the upcoming vertex is part of an edge.
   * Equivalent to glEdgeFlag(), for people familiar with OpenGL.
   */
  public void edge(boolean edge) {
    g.edge(edge);
  }


  /**
   * ( begin auto-generated from normal.xml )
   *
   * Sets the current normal vector. This is for drawing three dimensional
   * shapes and surfaces and specifies a vector perpendicular to the surface
   * of the shape which determines how lighting affects it. Processing
   * attempts to automatically assign normals to shapes, but since that's
   * imperfect, this is a better option when you want more control. This
   * function is identical to glNormal3f() in OpenGL.
   *
   * ( end auto-generated )
   * @webref lights_camera:lights
   * @param nx x direction
   * @param ny y direction
   * @param nz z direction
   * @see PGraphics#beginShape(int)
   * @see PGraphics#endShape(int)
   * @see PGraphics#lights()
   */
  public void normal(float nx, float ny, float nz) {
    g.normal(nx, ny, nz);
  }


  public void attribPosition(String name, float x, float y, float z) {
    g.attribPosition(name, x, y, z);
  }


  public void attribNormal(String name, float nx, float ny, float nz) {
    g.attribNormal(name, nx, ny, nz);
  }


  public void attribColor(String name, int color) {
    g.attribColor(name, color);
  }


  public void attrib(String name, float... values) {
    g.attrib(name, values);
  }


  public void attrib(String name, int... values) {
    g.attrib(name, values);
  }


  public void attrib(String name, boolean... values) {
    g.attrib(name, values);
  }


  /**
   * ( begin auto-generated from textureMode.xml )
   *
   * Sets the coordinate space for texture mapping. There are two options,
   * IMAGE, which refers to the actual coordinates of the image, and
   * NORMAL, which refers to a normalized space of values ranging from 0
   * to 1. The default mode is IMAGE. In IMAGE, if an image is 100 x 200
   * pixels, mapping the image onto the entire size of a quad would require
   * the points (0,0) (0,100) (100,200) (0,200). The same mapping in
   * NORMAL_SPACE is (0,0) (0,1) (1,1) (0,1).
   *
   * ( end auto-generated )
   * @webref image:textures
   * @param mode either IMAGE or NORMAL
   * @see PGraphics#texture(PImage)
   * @see PGraphics#textureWrap(int)
   */
  public void textureMode(int mode) {
    g.textureMode(mode);
  }


  /**
   * ( begin auto-generated from textureWrap.xml )
   *
   * Description to come...
   *
   * ( end auto-generated from textureWrap.xml )
   *
   * @webref image:textures
   * @param wrap Either CLAMP (default) or REPEAT
   * @see PGraphics#texture(PImage)
   * @see PGraphics#textureMode(int)
   */
  public void textureWrap(int wrap) {
    g.textureWrap(wrap);
  }


  /**
   * ( begin auto-generated from texture.xml )
   *
   * Sets a texture to be applied to vertex points. The <b>texture()</b>
   * function must be called between <b>beginShape()</b> and
   * <b>endShape()</b> and before any calls to <b>vertex()</b>.
   * <br/> <br/>
   * When textures are in use, the fill color is ignored. Instead, use tint()
   * to specify the color of the texture as it is applied to the shape.
   *
   * ( end auto-generated )
   * @webref image:textures
   * @param image reference to a PImage object
   * @see PGraphics#textureMode(int)
   * @see PGraphics#textureWrap(int)
   * @see PGraphics#beginShape(int)
   * @see PGraphics#endShape(int)
   * @see PGraphics#vertex(float, float, float, float, float)
   */
  public void texture(PImage image) {
    g.texture(image);
  }


  /**
   * Removes texture image for current shape.
   * Needs to be called between beginShape and endShape
   *
   */
  public void noTexture() {
    g.noTexture();
  }


  public void vertex(float x, float y) {
    g.vertex(x, y);
  }


  public void vertex(float x, float y, float z) {
    g.vertex(x, y, z);
  }


  /**
   * Used by renderer subclasses or PShape to efficiently pass in already
   * formatted vertex information.
   * @param v vertex parameters, as a float array of length VERTEX_FIELD_COUNT
   */
  public void vertex(float[] v) {
    g.vertex(v);
  }


  public void vertex(float x, float y, float u, float v) {
    g.vertex(x, y, u, v);
  }


/**
   * ( begin auto-generated from vertex.xml )
   *
   * All shapes are constructed by connecting a series of vertices.
   * <b>vertex()</b> is used to specify the vertex coordinates for points,
   * lines, triangles, quads, and polygons and is used exclusively within the
   * <b>beginShape()</b> and <b>endShape()</b> function.<br />
   * <br />
   * Drawing a vertex in 3D using the <b>z</b> parameter requires the P3D
   * parameter in combination with size as shown in the above example.<br />
   * <br />
   * This function is also used to map a texture onto the geometry. The
   * <b>texture()</b> function declares the texture to apply to the geometry
   * and the <b>u</b> and <b>v</b> coordinates set define the mapping of this
   * texture to the form. By default, the coordinates used for <b>u</b> and
   * <b>v</b> are specified in relation to the image's size in pixels, but
   * this relation can be changed with <b>textureMode()</b>.
   *
   * ( end auto-generated )
 * @webref shape:vertex
 * @param x x-coordinate of the vertex
 * @param y y-coordinate of the vertex
 * @param z z-coordinate of the vertex
 * @param u horizontal coordinate for the texture mapping
 * @param v vertical coordinate for the texture mapping
 * @see PGraphics#beginShape(int)
 * @see PGraphics#endShape(int)
 * @see PGraphics#bezierVertex(float, float, float, float, float, float, float, float, float)
 * @see PGraphics#quadraticVertex(float, float, float, float, float, float)
 * @see PGraphics#curveVertex(float, float, float)
 * @see PGraphics#texture(PImage)
 */
  public void vertex(float x, float y, float z, float u, float v) {
    g.vertex(x, y, z, u, v);
  }


  /**
   * @webref shape:vertex
   */
  public void beginContour() {
    g.beginContour();
  }


  /**
   * @webref shape:vertex
   */
  public void endContour() {
    g.endContour();
  }


  public void endShape() {
    g.endShape();
  }


  /**
   * ( begin auto-generated from endShape.xml )
   *
   * The <b>endShape()</b> function is the companion to <b>beginShape()</b>
   * and may only be called after <b>beginShape()</b>. When <b>endshape()</b>
   * is called, all of image data defined since the previous call to
   * <b>beginShape()</b> is written into the image buffer. The constant CLOSE
   * as the value for the MODE parameter to close the shape (to connect the
   * beginning and the end).
   *
   * ( end auto-generated )
   * @webref shape:vertex
   * @param mode use CLOSE to close the shape
   * @see PShape
   * @see PGraphics#beginShape(int)
   */
  public void endShape(int mode) {
    g.endShape(mode);
  }


  /**
   * @webref shape
   * @param filename name of file to load, can be .svg or .obj
   * @see PShape
   * @see PApplet#createShape()
   */
  public PShape loadShape(String filename) {
    return g.loadShape(filename);
  }


  /**
   * @nowebref
   */
  public PShape loadShape(String filename, String options) {
    return g.loadShape(filename, options);
  }


  /**
   * @webref shape
   * @see PShape
   * @see PShape#endShape()
   * @see PApplet#loadShape(String)
   */
  public PShape createShape() {
    return g.createShape();
  }


  public PShape createShape(int type) {
    return g.createShape(type);
  }


  /**
   * @param kind either POINT, LINE, TRIANGLE, QUAD, RECT, ELLIPSE, ARC, BOX, SPHERE
   * @param p parameters that match the kind of shape
   */
  public PShape createShape(int kind, float... p) {
    return g.createShape(kind, p);
  }


  /**
   * ( begin auto-generated from loadShader.xml )
   *
   * This is a new reference entry for Processing 2.0. It will be updated shortly.
   *
   * ( end auto-generated )
   *
   * @webref rendering:shaders
   * @param fragFilename name of fragment shader file
   */
  public PShader loadShader(String fragFilename) {
    return g.loadShader(fragFilename);
  }


  /**
   * @param vertFilename name of vertex shader file
   */
  public PShader loadShader(String fragFilename, String vertFilename) {
    return g.loadShader(fragFilename, vertFilename);
  }


  /**
   * ( begin auto-generated from shader.xml )
   *
   * This is a new reference entry for Processing 2.0. It will be updated shortly.
   *
   * ( end auto-generated )
   *
   * @webref rendering:shaders
   * @param shader name of shader file
   */
  public void shader(PShader shader) {
    g.shader(shader);
  }


  /**
   * @param kind type of shader, either POINTS, LINES, or TRIANGLES
   */
  public void shader(PShader shader, int kind) {
    g.shader(shader, kind);
  }


  /**
   * ( begin auto-generated from resetShader.xml )
   *
   * This is a new reference entry for Processing 2.0. It will be updated shortly.
   *
   * ( end auto-generated )
   *
   * @webref rendering:shaders
   */
  public void resetShader() {
    g.resetShader();
  }


  /**
   * @param kind type of shader, either POINTS, LINES, or TRIANGLES
   */
  public void resetShader(int kind) {
    g.resetShader(kind);
  }


  /**
   * @param shader the fragment shader to apply
   */
  public void filter(PShader shader) {
    g.filter(shader);
  }


  /**
   * ( begin auto-generated from clip.xml )
   *
   * Limits the rendering to the boundaries of a rectangle defined
   * by the parameters. The boundaries are drawn based on the state
   * of the <b>imageMode()</b> fuction, either CORNER, CORNERS, or CENTER.
   *
   * ( end auto-generated )
   *
   * @webref rendering
   * @param a x-coordinate of the rectangle, by default
   * @param b y-coordinate of the rectangle, by default
   * @param c width of the rectangle, by default
   * @param d height of the rectangle, by default
   */
  public void clip(float a, float b, float c, float d) {
    g.clip(a, b, c, d);
  }


  /**
   * ( begin auto-generated from noClip.xml )
   *
   * Disables the clipping previously started by the <b>clip()</b> function.
   *
   * ( end auto-generated )
   *
   * @webref rendering
   */
  public void noClip() {
    g.noClip();
  }


  /**
   * ( begin auto-generated from blendMode.xml )
   *
   * This is a new reference entry for Processing 2.0. It will be updated shortly.
   *
   * ( end auto-generated )
   *
   * @webref rendering
   * @param mode the blending mode to use
   */
  public void blendMode(int mode) {
    g.blendMode(mode);
  }


  public void bezierVertex(float x2, float y2,
                           float x3, float y3,
                           float x4, float y4) {
    g.bezierVertex(x2, y2, x3, y3, x4, y4);
  }


/**
   * ( begin auto-generated from bezierVertex.xml )
   *
   * Specifies vertex coordinates for Bezier curves. Each call to
   * <b>bezierVertex()</b> defines the position of two control points and one
   * anchor point of a Bezier curve, adding a new segment to a line or shape.
   * The first time <b>bezierVertex()</b> is used within a
   * <b>beginShape()</b> call, it must be prefaced with a call to
   * <b>vertex()</b> to set the first anchor point. This function must be
   * used between <b>beginShape()</b> and <b>endShape()</b> and only when
   * there is no MODE parameter specified to <b>beginShape()</b>. Using the
   * 3D version requires rendering with P3D (see the Environment reference
   * for more information).
   *
   * ( end auto-generated )
 * @webref shape:vertex
 * @param x2 the x-coordinate of the 1st control point
 * @param y2 the y-coordinate of the 1st control point
 * @param z2 the z-coordinate of the 1st control point
 * @param x3 the x-coordinate of the 2nd control point
 * @param y3 the y-coordinate of the 2nd control point
 * @param z3 the z-coordinate of the 2nd control point
 * @param x4 the x-coordinate of the anchor point
 * @param y4 the y-coordinate of the anchor point
 * @param z4 the z-coordinate of the anchor point
 * @see PGraphics#curveVertex(float, float, float)
 * @see PGraphics#vertex(float, float, float, float, float)
 * @see PGraphics#quadraticVertex(float, float, float, float, float, float)
 * @see PGraphics#bezier(float, float, float, float, float, float, float, float, float, float, float, float)
 */
  public void bezierVertex(float x2, float y2, float z2,
                           float x3, float y3, float z3,
                           float x4, float y4, float z4) {
    g.bezierVertex(x2, y2, z2, x3, y3, z3, x4, y4, z4);
  }


  /**
   * @webref shape:vertex
   * @param cx the x-coordinate of the control point
   * @param cy the y-coordinate of the control point
   * @param x3 the x-coordinate of the anchor point
   * @param y3 the y-coordinate of the anchor point
   * @see PGraphics#curveVertex(float, float, float)
   * @see PGraphics#vertex(float, float, float, float, float)
   * @see PGraphics#bezierVertex(float, float, float, float, float, float)
   * @see PGraphics#bezier(float, float, float, float, float, float, float, float, float, float, float, float)
   */
  public void quadraticVertex(float cx, float cy,
                              float x3, float y3) {
    g.quadraticVertex(cx, cy, x3, y3);
  }


  /**
   * @param cz the z-coordinate of the control point
   * @param z3 the z-coordinate of the anchor point
   */
  public void quadraticVertex(float cx, float cy, float cz,
                              float x3, float y3, float z3) {
    g.quadraticVertex(cx, cy, cz, x3, y3, z3);
  }


 /**
   * ( begin auto-generated from curveVertex.xml )
   *
   * Specifies vertex coordinates for curves. This function may only be used
   * between <b>beginShape()</b> and <b>endShape()</b> and only when there is
   * no MODE parameter specified to <b>beginShape()</b>. The first and last
   * points in a series of <b>curveVertex()</b> lines will be used to guide
   * the beginning and end of a the curve. A minimum of four points is
   * required to draw a tiny curve between the second and third points.
   * Adding a fifth point with <b>curveVertex()</b> will draw the curve
   * between the second, third, and fourth points. The <b>curveVertex()</b>
   * function is an implementation of Catmull-Rom splines. Using the 3D
   * version requires rendering with P3D (see the Environment reference for
   * more information).
   *
   * ( end auto-generated )
  *
  * @webref shape:vertex
  * @param x the x-coordinate of the vertex
  * @param y the y-coordinate of the vertex
  * @see PGraphics#curve(float, float, float, float, float, float, float, float, float, float, float, float)
  * @see PGraphics#beginShape(int)
  * @see PGraphics#endShape(int)
  * @see PGraphics#vertex(float, float, float, float, float)
  * @see PGraphics#bezier(float, float, float, float, float, float, float, float, float, float, float, float)
  * @see PGraphics#quadraticVertex(float, float, float, float, float, float)
  */
  public void curveVertex(float x, float y) {
    g.curveVertex(x, y);
  }


  /**
   * @param z the z-coordinate of the vertex
   */
  public void curveVertex(float x, float y, float z) {
    g.curveVertex(x, y, z);
  }


  /**
   * ( begin auto-generated from point.xml )
   *
   * Draws a point, a coordinate in space at the dimension of one pixel. The
   * first parameter is the horizontal value for the point, the second value
   * is the vertical value for the point, and the optional third value is the
   * depth value. Drawing this shape in 3D with the <b>z</b> parameter
   * requires the P3D parameter in combination with <b>size()</b> as shown in
   * the above example.
   *
   * ( end auto-generated )
   *
   * @webref shape:2d_primitives
   * @param x x-coordinate of the point
   * @param y y-coordinate of the point
   * @see PGraphics#stroke(int)
   */
  public void point(float x, float y) {
    g.point(x, y);
  }


  /**
   * @param z z-coordinate of the point
   */
  public void point(float x, float y, float z) {
    g.point(x, y, z);
  }


  /**
   * ( begin auto-generated from line.xml )
   *
   * Draws a line (a direct path between two points) to the screen. The
   * version of <b>line()</b> with four parameters draws the line in 2D.  To
   * color a line, use the <b>stroke()</b> function. A line cannot be filled,
   * therefore the <b>fill()</b> function will not affect the color of a
   * line. 2D lines are drawn with a width of one pixel by default, but this
   * can be changed with the <b>strokeWeight()</b> function. The version with
   * six parameters allows the line to be placed anywhere within XYZ space.
   * Drawing this shape in 3D with the <b>z</b> parameter requires the P3D
   * parameter in combination with <b>size()</b> as shown in the above example.
   *
   * ( end auto-generated )
   * @webref shape:2d_primitives
   * @param x1 x-coordinate of the first point
   * @param y1 y-coordinate of the first point
   * @param x2 x-coordinate of the second point
   * @param y2 y-coordinate of the second point
   * @see PGraphics#strokeWeight(float)
   * @see PGraphics#strokeJoin(int)
   * @see PGraphics#strokeCap(int)
   * @see PGraphics#beginShape()
   */
  public void line(float x1, float y1, float x2, float y2) {
    g.line(x1, y1, x2, y2);
  }


  /**
   * @param z1 z-coordinate of the first point
   * @param z2 z-coordinate of the second point
   */
  public void line(float x1, float y1, float z1,
                   float x2, float y2, float z2) {
    g.line(x1, y1, z1, x2, y2, z2);
  }


  /**
   * ( begin auto-generated from triangle.xml )
   *
   * A triangle is a plane created by connecting three points. The first two
   * arguments specify the first point, the middle two arguments specify the
   * second point, and the last two arguments specify the third point.
   *
   * ( end auto-generated )
   * @webref shape:2d_primitives
   * @param x1 x-coordinate of the first point
   * @param y1 y-coordinate of the first point
   * @param x2 x-coordinate of the second point
   * @param y2 y-coordinate of the second point
   * @param x3 x-coordinate of the third point
   * @param y3 y-coordinate of the third point
   * @see PApplet#beginShape()
   */
  public void triangle(float x1, float y1, float x2, float y2,
                       float x3, float y3) {
    g.triangle(x1, y1, x2, y2, x3, y3);
  }


  /**
   * ( begin auto-generated from quad.xml )
   *
   * A quad is a quadrilateral, a four sided polygon. It is similar to a
   * rectangle, but the angles between its edges are not constrained to
   * ninety degrees. The first pair of parameters (x1,y1) sets the first
   * vertex and the subsequent pairs should proceed clockwise or
   * counter-clockwise around the defined shape.
   *
   * ( end auto-generated )
   * @webref shape:2d_primitives
   * @param x1 x-coordinate of the first corner
   * @param y1 y-coordinate of the first corner
   * @param x2 x-coordinate of the second corner
   * @param y2 y-coordinate of the second corner
   * @param x3 x-coordinate of the third corner
   * @param y3 y-coordinate of the third corner
   * @param x4 x-coordinate of the fourth corner
   * @param y4 y-coordinate of the fourth corner
   */
  public void quad(float x1, float y1, float x2, float y2,
                   float x3, float y3, float x4, float y4) {
    g.quad(x1, y1, x2, y2, x3, y3, x4, y4);
  }


  /**
   * ( begin auto-generated from rectMode.xml )
   *
   * Modifies the location from which rectangles draw. The default mode is
   * <b>rectMode(CORNER)</b>, which specifies the location to be the upper
   * left corner of the shape and uses the third and fourth parameters of
   * <b>rect()</b> to specify the width and height. The syntax
   * <b>rectMode(CORNERS)</b> uses the first and second parameters of
   * <b>rect()</b> to set the location of one corner and uses the third and
   * fourth parameters to set the opposite corner. The syntax
   * <b>rectMode(CENTER)</b> draws the image from its center point and uses
   * the third and forth parameters of <b>rect()</b> to specify the image's
   * width and height. The syntax <b>rectMode(RADIUS)</b> draws the image
   * from its center point and uses the third and forth parameters of
   * <b>rect()</b> to specify half of the image's width and height. The
   * parameter must be written in ALL CAPS because Processing is a case
   * sensitive language. Note: In version 125, the mode named CENTER_RADIUS
   * was shortened to RADIUS.
   *
   * ( end auto-generated )
   * @webref shape:attributes
   * @param mode either CORNER, CORNERS, CENTER, or RADIUS
   * @see PGraphics#rect(float, float, float, float)
   */
  public void rectMode(int mode) {
    g.rectMode(mode);
  }


  /**
   * ( begin auto-generated from rect.xml )
   *
   * Draws a rectangle to the screen. A rectangle is a four-sided shape with
   * every angle at ninety degrees. By default, the first two parameters set
   * the location of the upper-left corner, the third sets the width, and the
   * fourth sets the height. These parameters may be changed with the
   * <b>rectMode()</b> function.
   *
   * ( end auto-generated )
   *
   * @webref shape:2d_primitives
   * @param a x-coordinate of the rectangle by default
   * @param b y-coordinate of the rectangle by default
   * @param c width of the rectangle by default
   * @param d height of the rectangle by default
   * @see PGraphics#rectMode(int)
   * @see PGraphics#quad(float, float, float, float, float, float, float, float)
   */
  public void rect(float a, float b, float c, float d) {
    g.rect(a, b, c, d);
  }


  /**
   * @param r radii for all four corners
   */
  public void rect(float a, float b, float c, float d, float r) {
    g.rect(a, b, c, d, r);
  }


  /**
   * @param tl radius for top-left corner
   * @param tr radius for top-right corner
   * @param br radius for bottom-right corner
   * @param bl radius for bottom-left corner
   */
  public void rect(float a, float b, float c, float d,
                   float tl, float tr, float br, float bl) {
    g.rect(a, b, c, d, tl, tr, br, bl);
  }


  /**
   * ( begin auto-generated from ellipseMode.xml )
   *
   * The origin of the ellipse is modified by the <b>ellipseMode()</b>
   * function. The default configuration is <b>ellipseMode(CENTER)</b>, which
   * specifies the location of the ellipse as the center of the shape. The
   * <b>RADIUS</b> mode is the same, but the width and height parameters to
   * <b>ellipse()</b> specify the radius of the ellipse, rather than the
   * diameter. The <b>CORNER</b> mode draws the shape from the upper-left
   * corner of its bounding box. The <b>CORNERS</b> mode uses the four
   * parameters to <b>ellipse()</b> to set two opposing corners of the
   * ellipse's bounding box. The parameter must be written in ALL CAPS
   * because Processing is a case-sensitive language.
   *
   * ( end auto-generated )
   * @webref shape:attributes
   * @param mode either CENTER, RADIUS, CORNER, or CORNERS
   * @see PApplet#ellipse(float, float, float, float)
   * @see PApplet#arc(float, float, float, float, float, float)
   */
  public void ellipseMode(int mode) {
    g.ellipseMode(mode);
  }


  /**
   * ( begin auto-generated from ellipse.xml )
   *
   * Draws an ellipse (oval) in the display window. An ellipse with an equal
   * <b>width</b> and <b>height</b> is a circle. The first two parameters set
   * the location, the third sets the width, and the fourth sets the height.
   * The origin may be changed with the <b>ellipseMode()</b> function.
   *
   * ( end auto-generated )
   * @webref shape:2d_primitives
   * @param a x-coordinate of the ellipse
   * @param b y-coordinate of the ellipse
   * @param c width of the ellipse by default
   * @param d height of the ellipse by default
   * @see PApplet#ellipseMode(int)
   * @see PApplet#arc(float, float, float, float, float, float)
   */
  public void ellipse(float a, float b, float c, float d) {
    g.ellipse(a, b, c, d);
  }


  /**
   * ( begin auto-generated from arc.xml )
   *
   * Draws an arc in the display window. Arcs are drawn along the outer edge
   * of an ellipse defined by the <b>x</b>, <b>y</b>, <b>width</b> and
   * <b>height</b> parameters. The origin or the arc's ellipse may be changed
   * with the <b>ellipseMode()</b> function. The <b>start</b> and <b>stop</b>
   * parameters specify the angles at which to draw the arc.
   *
   * ( end auto-generated )
   * @webref shape:2d_primitives
   * @param a x-coordinate of the arc's ellipse
   * @param b y-coordinate of the arc's ellipse
   * @param c width of the arc's ellipse by default
   * @param d height of the arc's ellipse by default
   * @param start angle to start the arc, specified in radians
   * @param stop angle to stop the arc, specified in radians
   * @see PApplet#ellipse(float, float, float, float)
   * @see PApplet#ellipseMode(int)
   * @see PApplet#radians(float)
   * @see PApplet#degrees(float)
   */
  public void arc(float a, float b, float c, float d,
                  float start, float stop) {
    g.arc(a, b, c, d, start, stop);
  }


  /*
   * @param mode either OPEN, CHORD, or PIE
   */
  public void arc(float a, float b, float c, float d,
                  float start, float stop, int mode) {
    g.arc(a, b, c, d, start, stop, mode);
  }


  /**
   * ( begin auto-generated from box.xml )
   *
   * A box is an extruded rectangle. A box with equal dimension on all sides
   * is a cube.
   *
   * ( end auto-generated )
   *
   * @webref shape:3d_primitives
   * @param size dimension of the box in all dimensions (creates a cube)
   * @see PGraphics#sphere(float)
   */
  public void box(float size) {
    g.box(size);
  }


  /**
   * @param w dimension of the box in the x-dimension
   * @param h dimension of the box in the y-dimension
   * @param d dimension of the box in the z-dimension
   */
  public void box(float w, float h, float d) {
    g.box(w, h, d);
  }


  /**
   * ( begin auto-generated from sphereDetail.xml )
   *
   * Controls the detail used to render a sphere by adjusting the number of
   * vertices of the sphere mesh. The default resolution is 30, which creates
   * a fairly detailed sphere definition with vertices every 360/30 = 12
   * degrees. If you're going to render a great number of spheres per frame,
   * it is advised to reduce the level of detail using this function. The
   * setting stays active until <b>sphereDetail()</b> is called again with a
   * new parameter and so should <i>not</i> be called prior to every
   * <b>sphere()</b> statement, unless you wish to render spheres with
   * different settings, e.g. using less detail for smaller spheres or ones
   * further away from the camera. To control the detail of the horizontal
   * and vertical resolution independently, use the version of the functions
   * with two parameters.
   *
   * ( end auto-generated )
   *
   * <h3>Advanced</h3>
   * Code for sphereDetail() submitted by toxi [031031].
   * Code for enhanced u/v version from davbol [080801].
   *
   * @param res number of segments (minimum 3) used per full circle revolution
   * @webref shape:3d_primitives
   * @see PGraphics#sphere(float)
   */
  public void sphereDetail(int res) {
    g.sphereDetail(res);
  }


  /**
   * @param ures number of segments used longitudinally per full circle revolutoin
   * @param vres number of segments used latitudinally from top to bottom
   */
  public void sphereDetail(int ures, int vres) {
    g.sphereDetail(ures, vres);
  }


  /**
   * ( begin auto-generated from sphere.xml )
   *
   * A sphere is a hollow ball made from tessellated triangles.
   *
   * ( end auto-generated )
   *
   * <h3>Advanced</h3>
   * <P>
   * Implementation notes:
   * <P>
   * cache all the points of the sphere in a static array
   * top and bottom are just a bunch of triangles that land
   * in the center point
   * <P>
   * sphere is a series of concentric circles who radii vary
   * along the shape, based on, er.. cos or something
   * <PRE>
   * [toxi 031031] new sphere code. removed all multiplies with
   * radius, as scale() will take care of that anyway
   *
   * [toxi 031223] updated sphere code (removed modulos)
   * and introduced sphereAt(x,y,z,r)
   * to avoid additional translate()'s on the user/sketch side
   *
   * [davbol 080801] now using separate sphereDetailU/V
   * </PRE>
   *
   * @webref shape:3d_primitives
   * @param r the radius of the sphere
   * @see PGraphics#sphereDetail(int)
   */
  public void sphere(float r) {
    g.sphere(r);
  }


  /**
   * ( begin auto-generated from bezierPoint.xml )
   *
   * Evaluates the Bezier at point t for points a, b, c, d. The parameter t
   * varies between 0 and 1, a and d are points on the curve, and b and c are
   * the control points. This can be done once with the x coordinates and a
   * second time with the y coordinates to get the location of a bezier curve
   * at t.
   *
   * ( end auto-generated )
   *
   * <h3>Advanced</h3>
   * For instance, to convert the following example:<PRE>
   * stroke(255, 102, 0);
   * line(85, 20, 10, 10);
   * line(90, 90, 15, 80);
   * stroke(0, 0, 0);
   * bezier(85, 20, 10, 10, 90, 90, 15, 80);
   *
   * // draw it in gray, using 10 steps instead of the default 20
   * // this is a slower way to do it, but useful if you need
   * // to do things with the coordinates at each step
   * stroke(128);
   * beginShape(LINE_STRIP);
   * for (int i = 0; i <= 10; i++) {
   *   float t = i / 10.0f;
   *   float x = bezierPoint(85, 10, 90, 15, t);
   *   float y = bezierPoint(20, 10, 90, 80, t);
   *   vertex(x, y);
   * }
   * endShape();</PRE>
   *
   * @webref shape:curves
   * @param a coordinate of first point on the curve
   * @param b coordinate of first control point
   * @param c coordinate of second control point
   * @param d coordinate of second point on the curve
   * @param t value between 0 and 1
   * @see PGraphics#bezier(float, float, float, float, float, float, float, float, float, float, float, float)
   * @see PGraphics#bezierVertex(float, float, float, float, float, float)
   * @see PGraphics#curvePoint(float, float, float, float, float)
   */
  public float bezierPoint(float a, float b, float c, float d, float t) {
    return g.bezierPoint(a, b, c, d, t);
  }


  /**
   * ( begin auto-generated from bezierTangent.xml )
   *
   * Calculates the tangent of a point on a Bezier curve. There is a good
   * definition of <a href="http://en.wikipedia.org/wiki/Tangent"
   * target="new"><em>tangent</em> on Wikipedia</a>.
   *
   * ( end auto-generated )
   *
   * <h3>Advanced</h3>
   * Code submitted by Dave Bollinger (davol) for release 0136.
   *
   * @webref shape:curves
   * @param a coordinate of first point on the curve
   * @param b coordinate of first control point
   * @param c coordinate of second control point
   * @param d coordinate of second point on the curve
   * @param t value between 0 and 1
   * @see PGraphics#bezier(float, float, float, float, float, float, float, float, float, float, float, float)
   * @see PGraphics#bezierVertex(float, float, float, float, float, float)
   * @see PGraphics#curvePoint(float, float, float, float, float)
   */
  public float bezierTangent(float a, float b, float c, float d, float t) {
    return g.bezierTangent(a, b, c, d, t);
  }


  /**
   * ( begin auto-generated from bezierDetail.xml )
   *
   * Sets the resolution at which Beziers display. The default value is 20.
   * This function is only useful when using the P3D renderer as the default
   * P2D renderer does not use this information.
   *
   * ( end auto-generated )
   *
   * @webref shape:curves
   * @param detail resolution of the curves
   * @see PGraphics#curve(float, float, float, float, float, float, float, float, float, float, float, float)
   * @see PGraphics#curveVertex(float, float, float)
   * @see PGraphics#curveTightness(float)
   */
  public void bezierDetail(int detail) {
    g.bezierDetail(detail);
  }


  public void bezier(float x1, float y1,
                     float x2, float y2,
                     float x3, float y3,
                     float x4, float y4) {
    g.bezier(x1, y1, x2, y2, x3, y3, x4, y4);
  }


  /**
   * ( begin auto-generated from bezier.xml )
   *
   * Draws a Bezier curve on the screen. These curves are defined by a series
   * of anchor and control points. The first two parameters specify the first
   * anchor point and the last two parameters specify the other anchor point.
   * The middle parameters specify the control points which define the shape
   * of the curve. Bezier curves were developed by French engineer Pierre
   * Bezier. Using the 3D version requires rendering with P3D (see the
   * Environment reference for more information).
   *
   * ( end auto-generated )
   *
   * <h3>Advanced</h3>
   * Draw a cubic bezier curve. The first and last points are
   * the on-curve points. The middle two are the 'control' points,
   * or 'handles' in an application like Illustrator.
   * <P>
   * Identical to typing:
   * <PRE>beginShape();
   * vertex(x1, y1);
   * bezierVertex(x2, y2, x3, y3, x4, y4);
   * endShape();
   * </PRE>
   * In Postscript-speak, this would be:
   * <PRE>moveto(x1, y1);
   * curveto(x2, y2, x3, y3, x4, y4);</PRE>
   * If you were to try and continue that curve like so:
   * <PRE>curveto(x5, y5, x6, y6, x7, y7);</PRE>
   * This would be done in processing by adding these statements:
   * <PRE>bezierVertex(x5, y5, x6, y6, x7, y7)
   * </PRE>
   * To draw a quadratic (instead of cubic) curve,
   * use the control point twice by doubling it:
   * <PRE>bezier(x1, y1, cx, cy, cx, cy, x2, y2);</PRE>
   *
   * @webref shape:curves
   * @param x1 coordinates for the first anchor point
   * @param y1 coordinates for the first anchor point
   * @param z1 coordinates for the first anchor point
   * @param x2 coordinates for the first control point
   * @param y2 coordinates for the first control point
   * @param z2 coordinates for the first control point
   * @param x3 coordinates for the second control point
   * @param y3 coordinates for the second control point
   * @param z3 coordinates for the second control point
   * @param x4 coordinates for the second anchor point
   * @param y4 coordinates for the second anchor point
   * @param z4 coordinates for the second anchor point
   *
   * @see PGraphics#bezierVertex(float, float, float, float, float, float)
   * @see PGraphics#curve(float, float, float, float, float, float, float, float, float, float, float, float)
   */
  public void bezier(float x1, float y1, float z1,
                     float x2, float y2, float z2,
                     float x3, float y3, float z3,
                     float x4, float y4, float z4) {
    g.bezier(x1, y1, z1, x2, y2, z2, x3, y3, z3, x4, y4, z4);
  }


  /**
   * ( begin auto-generated from curvePoint.xml )
   *
   * Evalutes the curve at point t for points a, b, c, d. The parameter t
   * varies between 0 and 1, a and d are points on the curve, and b and c are
   * the control points. This can be done once with the x coordinates and a
   * second time with the y coordinates to get the location of a curve at t.
   *
   * ( end auto-generated )
   *
   * @webref shape:curves
   * @param a coordinate of first point on the curve
   * @param b coordinate of second point on the curve
   * @param c coordinate of third point on the curve
   * @param d coordinate of fourth point on the curve
   * @param t value between 0 and 1
   * @see PGraphics#curve(float, float, float, float, float, float, float, float, float, float, float, float)
   * @see PGraphics#curveVertex(float, float)
   * @see PGraphics#bezierPoint(float, float, float, float, float)
   */
  public float curvePoint(float a, float b, float c, float d, float t) {
    return g.curvePoint(a, b, c, d, t);
  }


  /**
   * ( begin auto-generated from curveTangent.xml )
   *
   * Calculates the tangent of a point on a curve. There's a good definition
   * of <em><a href="http://en.wikipedia.org/wiki/Tangent"
   * target="new">tangent</em> on Wikipedia</a>.
   *
   * ( end auto-generated )
   *
   * <h3>Advanced</h3>
   * Code thanks to Dave Bollinger (Bug #715)
   *
   * @webref shape:curves
   * @param a coordinate of first point on the curve
   * @param b coordinate of first control point
   * @param c coordinate of second control point
   * @param d coordinate of second point on the curve
   * @param t value between 0 and 1
   * @see PGraphics#curve(float, float, float, float, float, float, float, float, float, float, float, float)
   * @see PGraphics#curveVertex(float, float)
   * @see PGraphics#curvePoint(float, float, float, float, float)
   * @see PGraphics#bezierTangent(float, float, float, float, float)
   */
  public float curveTangent(float a, float b, float c, float d, float t) {
    return g.curveTangent(a, b, c, d, t);
  }


  /**
   * ( begin auto-generated from curveDetail.xml )
   *
   * Sets the resolution at which curves display. The default value is 20.
   * This function is only useful when using the P3D renderer as the default
   * P2D renderer does not use this information.
   *
   * ( end auto-generated )
   *
   * @webref shape:curves
   * @param detail resolution of the curves
   * @see PGraphics#curve(float, float, float, float, float, float, float, float, float, float, float, float)
   * @see PGraphics#curveVertex(float, float)
   * @see PGraphics#curveTightness(float)
   */
  public void curveDetail(int detail) {
    g.curveDetail(detail);
  }


  /**
   * ( begin auto-generated from curveTightness.xml )
   *
   * Modifies the quality of forms created with <b>curve()</b> and
   * <b>curveVertex()</b>. The parameter <b>squishy</b> determines how the
   * curve fits to the vertex points. The value 0.0 is the default value for
   * <b>squishy</b> (this value defines the curves to be Catmull-Rom splines)
   * and the value 1.0 connects all the points with straight lines. Values
   * within the range -5.0 and 5.0 will deform the curves but will leave them
   * recognizable and as values increase in magnitude, they will continue to deform.
   *
   * ( end auto-generated )
   *
   * @webref shape:curves
   * @param tightness amount of deformation from the original vertices
   * @see PGraphics#curve(float, float, float, float, float, float, float, float, float, float, float, float)
   * @see PGraphics#curveVertex(float, float)
   */
  public void curveTightness(float tightness) {
    g.curveTightness(tightness);
  }


  /**
   * ( begin auto-generated from curve.xml )
   *
   * Draws a curved line on the screen. The first and second parameters
   * specify the beginning control point and the last two parameters specify
   * the ending control point. The middle parameters specify the start and
   * stop of the curve. Longer curves can be created by putting a series of
   * <b>curve()</b> functions together or using <b>curveVertex()</b>. An
   * additional function called <b>curveTightness()</b> provides control for
   * the visual quality of the curve. The <b>curve()</b> function is an
   * implementation of Catmull-Rom splines. Using the 3D version requires
   * rendering with P3D (see the Environment reference for more information).
   *
   * ( end auto-generated )
   *
   * <h3>Advanced</h3>
   * As of revision 0070, this function no longer doubles the first
   * and last points. The curves are a bit more boring, but it's more
   * mathematically correct, and properly mirrored in curvePoint().
   * <P>
   * Identical to typing out:<PRE>
   * beginShape();
   * curveVertex(x1, y1);
   * curveVertex(x2, y2);
   * curveVertex(x3, y3);
   * curveVertex(x4, y4);
   * endShape();
   * </PRE>
   *
   * @webref shape:curves
   * @param x1 coordinates for the beginning control point
   * @param y1 coordinates for the beginning control point
   * @param x2 coordinates for the first point
   * @param y2 coordinates for the first point
   * @param x3 coordinates for the second point
   * @param y3 coordinates for the second point
   * @param x4 coordinates for the ending control point
   * @param y4 coordinates for the ending control point
   * @see PGraphics#curveVertex(float, float)
   * @see PGraphics#curveTightness(float)
   * @see PGraphics#bezier(float, float, float, float, float, float, float, float, float, float, float, float)
   */
  public void curve(float x1, float y1,
                    float x2, float y2,
                    float x3, float y3,
                    float x4, float y4) {
    g.curve(x1, y1, x2, y2, x3, y3, x4, y4);
  }


   /**
    * @param z1 coordinates for the beginning control point
    * @param z2 coordinates for the first point
    * @param z3 coordinates for the second point
    * @param z4 coordinates for the ending control point
    */
  public void curve(float x1, float y1, float z1,
                    float x2, float y2, float z2,
                    float x3, float y3, float z3,
                    float x4, float y4, float z4) {
    g.curve(x1, y1, z1, x2, y2, z2, x3, y3, z3, x4, y4, z4);
  }


  /**
   * ( begin auto-generated from imageMode.xml )
   *
   * Modifies the location from which images draw. The default mode is
   * <b>imageMode(CORNER)</b>, which specifies the location to be the upper
   * left corner and uses the fourth and fifth parameters of <b>image()</b>
   * to set the image's width and height. The syntax
   * <b>imageMode(CORNERS)</b> uses the second and third parameters of
   * <b>image()</b> to set the location of one corner of the image and uses
   * the fourth and fifth parameters to set the opposite corner. Use
   * <b>imageMode(CENTER)</b> to draw images centered at the given x and y
   * position.<br />
   * <br />
   * The parameter to <b>imageMode()</b> must be written in ALL CAPS because
   * Processing is a case-sensitive language.
   *
   * ( end auto-generated )
   *
   * @webref image:loading_displaying
   * @param mode either CORNER, CORNERS, or CENTER
   * @see PApplet#loadImage(String, String)
   * @see PImage
   * @see PGraphics#image(PImage, float, float, float, float)
   * @see PGraphics#background(float, float, float, float)
   */
  public void imageMode(int mode) {
    g.imageMode(mode);
  }


  /**
   * ( begin auto-generated from image.xml )
   *
   * Displays images to the screen. The images must be in the sketch's "data"
   * directory to load correctly. Select "Add file..." from the "Sketch" menu
   * to add the image. Processing currently works with GIF, JPEG, and Targa
   * images. The <b>img</b> parameter specifies the image to display and the
   * <b>x</b> and <b>y</b> parameters define the location of the image from
   * its upper-left corner. The image is displayed at its original size
   * unless the <b>width</b> and <b>height</b> parameters specify a different
   * size.<br />
   * <br />
   * The <b>imageMode()</b> function changes the way the parameters work. For
   * example, a call to <b>imageMode(CORNERS)</b> will change the
   * <b>width</b> and <b>height</b> parameters to define the x and y values
   * of the opposite corner of the image.<br />
   * <br />
   * The color of an image may be modified with the <b>tint()</b> function.
   * This function will maintain transparency for GIF and PNG images.
   *
   * ( end auto-generated )
   *
   * <h3>Advanced</h3>
   * Starting with release 0124, when using the default (JAVA2D) renderer,
   * smooth() will also improve image quality of resized images.
   *
   * @webref image:loading_displaying
   * @param img the image to display
   * @param a x-coordinate of the image by default
   * @param b y-coordinate of the image by default
   * @see PApplet#loadImage(String, String)
   * @see PImage
   * @see PGraphics#imageMode(int)
   * @see PGraphics#tint(float)
   * @see PGraphics#background(float, float, float, float)
   * @see PGraphics#alpha(int)
   */
  public void image(PImage img, float a, float b) {
    g.image(img, a, b);
  }


  /**
   * @param c width to display the image by default
   * @param d height to display the image by default
   */
  public void image(PImage img, float a, float b, float c, float d) {
    g.image(img, a, b, c, d);
  }


  /**
   * Draw an image(), also specifying u/v coordinates.
   * In this method, the  u, v coordinates are always based on image space
   * location, regardless of the current textureMode().
   *
   * @nowebref
   */
  public void image(PImage img,
                    float a, float b, float c, float d,
                    int u1, int v1, int u2, int v2) {
    g.image(img, a, b, c, d, u1, v1, u2, v2);
  }


  /**
   * ( begin auto-generated from shapeMode.xml )
   *
   * Modifies the location from which shapes draw. The default mode is
   * <b>shapeMode(CORNER)</b>, which specifies the location to be the upper
   * left corner of the shape and uses the third and fourth parameters of
   * <b>shape()</b> to specify the width and height. The syntax
   * <b>shapeMode(CORNERS)</b> uses the first and second parameters of
   * <b>shape()</b> to set the location of one corner and uses the third and
   * fourth parameters to set the opposite corner. The syntax
   * <b>shapeMode(CENTER)</b> draws the shape from its center point and uses
   * the third and forth parameters of <b>shape()</b> to specify the width
   * and height. The parameter must be written in "ALL CAPS" because
   * Processing is a case sensitive language.
   *
   * ( end auto-generated )
   *
   * @webref shape:loading_displaying
   * @param mode either CORNER, CORNERS, CENTER
   * @see PShape
   * @see PGraphics#shape(PShape)
   * @see PGraphics#rectMode(int)
   */
  public void shapeMode(int mode) {
    g.shapeMode(mode);
  }


  public void shape(PShape shape) {
    g.shape(shape);
  }


  /**
   * ( begin auto-generated from shape.xml )
   *
   * Displays shapes to the screen. The shapes must be in the sketch's "data"
   * directory to load correctly. Select "Add file..." from the "Sketch" menu
   * to add the shape. Processing currently works with SVG shapes only. The
   * <b>sh</b> parameter specifies the shape to display and the <b>x</b> and
   * <b>y</b> parameters define the location of the shape from its upper-left
   * corner. The shape is displayed at its original size unless the
   * <b>width</b> and <b>height</b> parameters specify a different size. The
   * <b>shapeMode()</b> function changes the way the parameters work. A call
   * to <b>shapeMode(CORNERS)</b>, for example, will change the width and
   * height parameters to define the x and y values of the opposite corner of
   * the shape.
   * <br /><br />
   * Note complex shapes may draw awkwardly with P3D. This renderer does not
   * yet support shapes that have holes or complicated breaks.
   *
   * ( end auto-generated )
   *
   * @webref shape:loading_displaying
   * @param shape the shape to display
   * @param x x-coordinate of the shape
   * @param y y-coordinate of the shape
   * @see PShape
   * @see PApplet#loadShape(String)
   * @see PGraphics#shapeMode(int)
   *
   * Convenience method to draw at a particular location.
   */
  public void shape(PShape shape, float x, float y) {
    g.shape(shape, x, y);
  }


  /**
   * @param a x-coordinate of the shape
   * @param b y-coordinate of the shape
   * @param c width to display the shape
   * @param d height to display the shape
   */
  public void shape(PShape shape, float a, float b, float c, float d) {
    g.shape(shape, a, b, c, d);
  }


  public void textAlign(int alignX) {
    g.textAlign(alignX);
  }


  /**
   * ( begin auto-generated from textAlign.xml )
   *
   * Sets the current alignment for drawing text. The parameters LEFT,
   * CENTER, and RIGHT set the display characteristics of the letters in
   * relation to the values for the <b>x</b> and <b>y</b> parameters of the
   * <b>text()</b> function.
   * <br/> <br/>
   * In Processing 0125 and later, an optional second parameter can be used
   * to vertically align the text. BASELINE is the default, and the vertical
   * alignment will be reset to BASELINE if the second parameter is not used.
   * The TOP and CENTER parameters are straightforward. The BOTTOM parameter
   * offsets the line based on the current <b>textDescent()</b>. For multiple
   * lines, the final line will be aligned to the bottom, with the previous
   * lines appearing above it.
   * <br/> <br/>
   * When using <b>text()</b> with width and height parameters, BASELINE is
   * ignored, and treated as TOP. (Otherwise, text would by default draw
   * outside the box, since BASELINE is the default setting. BASELINE is not
   * a useful drawing mode for text drawn in a rectangle.)
   * <br/> <br/>
   * The vertical alignment is based on the value of <b>textAscent()</b>,
   * which many fonts do not specify correctly. It may be necessary to use a
   * hack and offset by a few pixels by hand so that the offset looks
   * correct. To do this as less of a hack, use some percentage of
   * <b>textAscent()</b> or <b>textDescent()</b> so that the hack works even
   * if you change the size of the font.
   *
   * ( end auto-generated )
   *
   * @webref typography:attributes
   * @param alignX horizontal alignment, either LEFT, CENTER, or RIGHT
   * @param alignY vertical alignment, either TOP, BOTTOM, CENTER, or BASELINE
   * @see PApplet#loadFont(String)
   * @see PFont
   * @see PGraphics#text(String, float, float)
   * @see PGraphics#textSize(float)
   * @see PGraphics#textAscent()
   * @see PGraphics#textDescent()
   */
  public void textAlign(int alignX, int alignY) {
    g.textAlign(alignX, alignY);
  }


  /**
   * ( begin auto-generated from textAscent.xml )
   *
   * Returns ascent of the current font at its current size. This information
   * is useful for determining the height of the font above the baseline. For
   * example, adding the <b>textAscent()</b> and <b>textDescent()</b> values
   * will give you the total height of the line.
   *
   * ( end auto-generated )
   *
   * @webref typography:metrics
   * @see PGraphics#textDescent()
   */
  public float textAscent() {
    return g.textAscent();
  }


  /**
   * ( begin auto-generated from textDescent.xml )
   *
   * Returns descent of the current font at its current size. This
   * information is useful for determining the height of the font below the
   * baseline. For example, adding the <b>textAscent()</b> and
   * <b>textDescent()</b> values will give you the total height of the line.
   *
   * ( end auto-generated )
   *
   * @webref typography:metrics
   * @see PGraphics#textAscent()
   */
  public float textDescent() {
    return g.textDescent();
  }


  /**
   * ( begin auto-generated from textFont.xml )
   *
   * Sets the current font that will be drawn with the <b>text()</b>
   * function. Fonts must be loaded with <b>loadFont()</b> before it can be
   * used. This font will be used in all subsequent calls to the
   * <b>text()</b> function. If no <b>size</b> parameter is input, the font
   * will appear at its original size (the size it was created at with the
   * "Create Font..." tool) until it is changed with <b>textSize()</b>. <br
   * /> <br /> Because fonts are usually bitmaped, you should create fonts at
   * the sizes that will be used most commonly. Using <b>textFont()</b>
   * without the size parameter will result in the cleanest-looking text. <br
   * /><br /> With the default (JAVA2D) and PDF renderers, it's also possible
   * to enable the use of native fonts via the command
   * <b>hint(ENABLE_NATIVE_FONTS)</b>. This will produce vector text in
   * JAVA2D sketches and PDF output in cases where the vector data is
   * available: when the font is still installed, or the font is created via
   * the <b>createFont()</b> function (rather than the Create Font tool).
   *
   * ( end auto-generated )
   *
   * @webref typography:loading_displaying
   * @param which any variable of the type PFont
   * @see PApplet#createFont(String, float, boolean)
   * @see PApplet#loadFont(String)
   * @see PFont
   * @see PGraphics#text(String, float, float)
   * @see PGraphics#textSize(float)
   */
  public void textFont(PFont which) {
    g.textFont(which);
  }


  /**
   * @param size the size of the letters in units of pixels
   */
  public void textFont(PFont which, float size) {
    g.textFont(which, size);
  }


  /**
   * ( begin auto-generated from textLeading.xml )
   *
   * Sets the spacing between lines of text in units of pixels. This setting
   * will be used in all subsequent calls to the <b>text()</b> function.
   *
   * ( end auto-generated )
   *
   * @webref typography:attributes
   * @param leading the size in pixels for spacing between lines
   * @see PApplet#loadFont(String)
   * @see PFont#PFont
   * @see PGraphics#text(String, float, float)
   * @see PGraphics#textFont(PFont)
   * @see PGraphics#textSize(float)
   */
  public void textLeading(float leading) {
    g.textLeading(leading);
  }


  /**
   * ( begin auto-generated from textMode.xml )
   *
   * Sets the way text draws to the screen. In the default configuration, the
   * <b>MODEL</b> mode, it's possible to rotate, scale, and place letters in
   * two and three dimensional space.<br />
   * <br />
   * The <b>SHAPE</b> mode draws text using the the glyph outlines of
   * individual characters rather than as textures. This mode is only
   * supported with the <b>PDF</b> and <b>P3D</b> renderer settings. With the
   * <b>PDF</b> renderer, you must call <b>textMode(SHAPE)</b> before any
   * other drawing occurs. If the outlines are not available, then
   * <b>textMode(SHAPE)</b> will be ignored and <b>textMode(MODEL)</b> will
   * be used instead.<br />
   * <br />
   * The <b>textMode(SHAPE)</b> option in <b>P3D</b> can be combined with
   * <b>beginRaw()</b> to write vector-accurate text to 2D and 3D output
   * files, for instance <b>DXF</b> or <b>PDF</b>. The <b>SHAPE</b> mode is
   * not currently optimized for <b>P3D</b>, so if recording shape data, use
   * <b>textMode(MODEL)</b> until you're ready to capture the geometry with <b>beginRaw()</b>.
   *
   * ( end auto-generated )
   *
   * @webref typography:attributes
   * @param mode either MODEL or SHAPE
   * @see PApplet#loadFont(String)
   * @see PFont#PFont
   * @see PGraphics#text(String, float, float)
   * @see PGraphics#textFont(PFont)
   * @see PGraphics#beginRaw(PGraphics)
   * @see PApplet#createFont(String, float, boolean)
   */
  public void textMode(int mode) {
    g.textMode(mode);
  }


  /**
   * ( begin auto-generated from textSize.xml )
   *
   * Sets the current font size. This size will be used in all subsequent
   * calls to the <b>text()</b> function. Font size is measured in units of pixels.
   *
   * ( end auto-generated )
   *
   * @webref typography:attributes
   * @param size the size of the letters in units of pixels
   * @see PApplet#loadFont(String)
   * @see PFont#PFont
   * @see PGraphics#text(String, float, float)
   * @see PGraphics#textFont(PFont)
   */
  public void textSize(float size) {
    g.textSize(size);
  }


  /**
   * @param c the character to measure
   */
  public float textWidth(char c) {
    return g.textWidth(c);
  }


  /**
   * ( begin auto-generated from textWidth.xml )
   *
   * Calculates and returns the width of any character or text string.
   *
   * ( end auto-generated )
   *
   * @webref typography:attributes
   * @param str the String of characters to measure
   * @see PApplet#loadFont(String)
   * @see PFont#PFont
   * @see PGraphics#text(String, float, float)
   * @see PGraphics#textFont(PFont)
   * @see PGraphics#textSize(float)
   */
  public float textWidth(String str) {
    return g.textWidth(str);
  }


  /**
   * @nowebref
   */
  public float textWidth(char[] chars, int start, int length) {
    return g.textWidth(chars, start, length);
  }


  /**
   * ( begin auto-generated from text.xml )
   *
   * Draws text to the screen. Displays the information specified in the
   * <b>data</b> or <b>stringdata</b> parameters on the screen in the
   * position specified by the <b>x</b> and <b>y</b> parameters and the
   * optional <b>z</b> parameter. A default font will be used unless a font
   * is set with the <b>textFont()</b> function. Change the color of the text
   * with the <b>fill()</b> function. The text displays in relation to the
   * <b>textAlign()</b> function, which gives the option to draw to the left,
   * right, and center of the coordinates.
   * <br /><br />
   * The <b>x2</b> and <b>y2</b> parameters define a rectangular area to
   * display within and may only be used with string data. For text drawn
   * inside a rectangle, the coordinates are interpreted based on the current
   * <b>rectMode()</b> setting.
   *
   * ( end auto-generated )
   *
   * @webref typography:loading_displaying
   * @param c the alphanumeric character to be displayed
   * @param x x-coordinate of text
   * @param y y-coordinate of text
   * @see PGraphics#textAlign(int, int)
   * @see PGraphics#textFont(PFont)
   * @see PGraphics#textMode(int)
   * @see PGraphics#textSize(float)
   * @see PGraphics#textLeading(float)
   * @see PGraphics#textWidth(String)
   * @see PGraphics#textAscent()
   * @see PGraphics#textDescent()
   * @see PGraphics#rectMode(int)
   * @see PGraphics#fill(int, float)
   * @see_external String
   */
  public void text(char c, float x, float y) {
    g.text(c, x, y);
  }


  /**
   * @param z z-coordinate of text
   */
  public void text(char c, float x, float y, float z) {
    g.text(c, x, y, z);
  }


  /**
   * <h3>Advanced</h3>
   * Draw a chunk of text.
   * Newlines that are \n (Unix newline or linefeed char, ascii 10)
   * are honored, but \r (carriage return, Windows and Mac OS) are
   * ignored.
   */
  public void text(String str, float x, float y) {
    g.text(str, x, y);
  }


  /**
   * <h3>Advanced</h3>
   * Method to draw text from an array of chars. This method will usually be
   * more efficient than drawing from a String object, because the String will
   * not be converted to a char array before drawing.
   * @param chars the alphanumberic symbols to be displayed
   * @param start array index at which to start writing characters
   * @param stop array index at which to stop writing characters
   */
  public void text(char[] chars, int start, int stop, float x, float y) {
    g.text(chars, start, stop, x, y);
  }


  /**
   * Same as above but with a z coordinate.
   */
  public void text(String str, float x, float y, float z) {
    g.text(str, x, y, z);
  }


  public void text(char[] chars, int start, int stop,
                   float x, float y, float z) {
    g.text(chars, start, stop, x, y, z);
  }


  /**
   * <h3>Advanced</h3>
   * Draw text in a box that is constrained to a particular size.
   * The current rectMode() determines what the coordinates mean
   * (whether x1/y1/x2/y2 or x/y/w/h).
   * <P/>
   * Note that the x,y coords of the start of the box
   * will align with the *ascent* of the text, not the baseline,
   * as is the case for the other text() functions.
   * <P/>
   * Newlines that are \n (Unix newline or linefeed char, ascii 10)
   * are honored, and \r (carriage return, Windows and Mac OS) are
   * ignored.
   *
   * @param x1 by default, the x-coordinate of text, see rectMode() for more info
   * @param y1 by default, the y-coordinate of text, see rectMode() for more info
   * @param x2 by default, the width of the text box, see rectMode() for more info
   * @param y2 by default, the height of the text box, see rectMode() for more info
   */
  public void text(String str, float x1, float y1, float x2, float y2) {
    g.text(str, x1, y1, x2, y2);
  }


  public void text(int num, float x, float y) {
    g.text(num, x, y);
  }


  public void text(int num, float x, float y, float z) {
    g.text(num, x, y, z);
  }


  /**
   * This does a basic number formatting, to avoid the
   * generally ugly appearance of printing floats.
   * Users who want more control should use their own nf() cmmand,
   * or if they want the long, ugly version of float,
   * use String.valueOf() to convert the float to a String first.
   *
   * @param num the numeric value to be displayed
   */
  public void text(float num, float x, float y) {
    g.text(num, x, y);
  }


  public void text(float num, float x, float y, float z) {
    g.text(num, x, y, z);
  }


  /**
   * ( begin auto-generated from pushMatrix.xml )
   *
   * Pushes the current transformation matrix onto the matrix stack.
   * Understanding <b>pushMatrix()</b> and <b>popMatrix()</b> requires
   * understanding the concept of a matrix stack. The <b>pushMatrix()</b>
   * function saves the current coordinate system to the stack and
   * <b>popMatrix()</b> restores the prior coordinate system.
   * <b>pushMatrix()</b> and <b>popMatrix()</b> are used in conjuction with
   * the other transformation functions and may be embedded to control the
   * scope of the transformations.
   *
   * ( end auto-generated )
   *
   * @webref transform
   * @see PGraphics#popMatrix()
   * @see PGraphics#translate(float, float, float)
   * @see PGraphics#scale(float)
   * @see PGraphics#rotate(float)
   * @see PGraphics#rotateX(float)
   * @see PGraphics#rotateY(float)
   * @see PGraphics#rotateZ(float)
   */
  public void pushMatrix() {
    g.pushMatrix();
  }


  /**
   * ( begin auto-generated from popMatrix.xml )
   *
   * Pops the current transformation matrix off the matrix stack.
   * Understanding pushing and popping requires understanding the concept of
   * a matrix stack. The <b>pushMatrix()</b> function saves the current
   * coordinate system to the stack and <b>popMatrix()</b> restores the prior
   * coordinate system. <b>pushMatrix()</b> and <b>popMatrix()</b> are used
   * in conjuction with the other transformation functions and may be
   * embedded to control the scope of the transformations.
   *
   * ( end auto-generated )
   *
   * @webref transform
   * @see PGraphics#pushMatrix()
   */
  public void popMatrix() {
    g.popMatrix();
  }


  /**
   * ( begin auto-generated from translate.xml )
   *
   * Specifies an amount to displace objects within the display window. The
   * <b>x</b> parameter specifies left/right translation, the <b>y</b>
   * parameter specifies up/down translation, and the <b>z</b> parameter
   * specifies translations toward/away from the screen. Using this function
   * with the <b>z</b> parameter requires using P3D as a parameter in
   * combination with size as shown in the above example. Transformations
   * apply to everything that happens after and subsequent calls to the
   * function accumulates the effect. For example, calling <b>translate(50,
   * 0)</b> and then <b>translate(20, 0)</b> is the same as <b>translate(70,
   * 0)</b>. If <b>translate()</b> is called within <b>draw()</b>, the
   * transformation is reset when the loop begins again. This function can be
   * further controlled by the <b>pushMatrix()</b> and <b>popMatrix()</b>.
   *
   * ( end auto-generated )
   *
   * @webref transform
   * @param x left/right translation
   * @param y up/down translation
   * @see PGraphics#popMatrix()
   * @see PGraphics#pushMatrix()
   * @see PGraphics#rotate(float)
   * @see PGraphics#rotateX(float)
   * @see PGraphics#rotateY(float)
   * @see PGraphics#rotateZ(float)
   * @see PGraphics#scale(float, float, float)
   */
  public void translate(float x, float y) {
    g.translate(x, y);
  }


  /**
   * @param z forward/backward translation
   */
  public void translate(float x, float y, float z) {
    g.translate(x, y, z);
  }


  /**
   * ( begin auto-generated from rotate.xml )
   *
   * Rotates a shape the amount specified by the <b>angle</b> parameter.
   * Angles should be specified in radians (values from 0 to TWO_PI) or
   * converted to radians with the <b>radians()</b> function.
   * <br/> <br/>
   * Objects are always rotated around their relative position to the origin
   * and positive numbers rotate objects in a clockwise direction.
   * Transformations apply to everything that happens after and subsequent
   * calls to the function accumulates the effect. For example, calling
   * <b>rotate(HALF_PI)</b> and then <b>rotate(HALF_PI)</b> is the same as
   * <b>rotate(PI)</b>. All tranformations are reset when <b>draw()</b>
   * begins again.
   * <br/> <br/>
   * Technically, <b>rotate()</b> multiplies the current transformation
   * matrix by a rotation matrix. This function can be further controlled by
   * the <b>pushMatrix()</b> and <b>popMatrix()</b>.
   *
   * ( end auto-generated )
   *
   * @webref transform
   * @param angle angle of rotation specified in radians
   * @see PGraphics#popMatrix()
   * @see PGraphics#pushMatrix()
   * @see PGraphics#rotateX(float)
   * @see PGraphics#rotateY(float)
   * @see PGraphics#rotateZ(float)
   * @see PGraphics#scale(float, float, float)
   * @see PApplet#radians(float)
   */
  public void rotate(float angle) {
    g.rotate(angle);
  }


  /**
   * ( begin auto-generated from rotateX.xml )
   *
   * Rotates a shape around the x-axis the amount specified by the
   * <b>angle</b> parameter. Angles should be specified in radians (values
   * from 0 to PI*2) or converted to radians with the <b>radians()</b>
   * function. Objects are always rotated around their relative position to
   * the origin and positive numbers rotate objects in a counterclockwise
   * direction. Transformations apply to everything that happens after and
   * subsequent calls to the function accumulates the effect. For example,
   * calling <b>rotateX(PI/2)</b> and then <b>rotateX(PI/2)</b> is the same
   * as <b>rotateX(PI)</b>. If <b>rotateX()</b> is called within the
   * <b>draw()</b>, the transformation is reset when the loop begins again.
   * This function requires using P3D as a third parameter to <b>size()</b>
   * as shown in the example above.
   *
   * ( end auto-generated )
   *
   * @webref transform
   * @param angle angle of rotation specified in radians
   * @see PGraphics#popMatrix()
   * @see PGraphics#pushMatrix()
   * @see PGraphics#rotate(float)
   * @see PGraphics#rotateY(float)
   * @see PGraphics#rotateZ(float)
   * @see PGraphics#scale(float, float, float)
   * @see PGraphics#translate(float, float, float)
   */
  public void rotateX(float angle) {
    g.rotateX(angle);
  }


  /**
   * ( begin auto-generated from rotateY.xml )
   *
   * Rotates a shape around the y-axis the amount specified by the
   * <b>angle</b> parameter. Angles should be specified in radians (values
   * from 0 to PI*2) or converted to radians with the <b>radians()</b>
   * function. Objects are always rotated around their relative position to
   * the origin and positive numbers rotate objects in a counterclockwise
   * direction. Transformations apply to everything that happens after and
   * subsequent calls to the function accumulates the effect. For example,
   * calling <b>rotateY(PI/2)</b> and then <b>rotateY(PI/2)</b> is the same
   * as <b>rotateY(PI)</b>. If <b>rotateY()</b> is called within the
   * <b>draw()</b>, the transformation is reset when the loop begins again.
   * This function requires using P3D as a third parameter to <b>size()</b>
   * as shown in the examples above.
   *
   * ( end auto-generated )
   *
   * @webref transform
   * @param angle angle of rotation specified in radians
   * @see PGraphics#popMatrix()
   * @see PGraphics#pushMatrix()
   * @see PGraphics#rotate(float)
   * @see PGraphics#rotateX(float)
   * @see PGraphics#rotateZ(float)
   * @see PGraphics#scale(float, float, float)
   * @see PGraphics#translate(float, float, float)
   */
  public void rotateY(float angle) {
    g.rotateY(angle);
  }


  /**
   * ( begin auto-generated from rotateZ.xml )
   *
   * Rotates a shape around the z-axis the amount specified by the
   * <b>angle</b> parameter. Angles should be specified in radians (values
   * from 0 to PI*2) or converted to radians with the <b>radians()</b>
   * function. Objects are always rotated around their relative position to
   * the origin and positive numbers rotate objects in a counterclockwise
   * direction. Transformations apply to everything that happens after and
   * subsequent calls to the function accumulates the effect. For example,
   * calling <b>rotateZ(PI/2)</b> and then <b>rotateZ(PI/2)</b> is the same
   * as <b>rotateZ(PI)</b>. If <b>rotateZ()</b> is called within the
   * <b>draw()</b>, the transformation is reset when the loop begins again.
   * This function requires using P3D as a third parameter to <b>size()</b>
   * as shown in the examples above.
   *
   * ( end auto-generated )
   *
   * @webref transform
   * @param angle angle of rotation specified in radians
   * @see PGraphics#popMatrix()
   * @see PGraphics#pushMatrix()
   * @see PGraphics#rotate(float)
   * @see PGraphics#rotateX(float)
   * @see PGraphics#rotateY(float)
   * @see PGraphics#scale(float, float, float)
   * @see PGraphics#translate(float, float, float)
   */
  public void rotateZ(float angle) {
    g.rotateZ(angle);
  }


  /**
   * <h3>Advanced</h3>
   * Rotate about a vector in space. Same as the glRotatef() function.
   * @nowebref
   * @param x
   * @param y
   * @param z
   */
  public void rotate(float angle, float x, float y, float z) {
    g.rotate(angle, x, y, z);
  }


  /**
   * ( begin auto-generated from scale.xml )
   *
   * Increases or decreases the size of a shape by expanding and contracting
   * vertices. Objects always scale from their relative origin to the
   * coordinate system. Scale values are specified as decimal percentages.
   * For example, the function call <b>scale(2.0)</b> increases the dimension
   * of a shape by 200%. Transformations apply to everything that happens
   * after and subsequent calls to the function multiply the effect. For
   * example, calling <b>scale(2.0)</b> and then <b>scale(1.5)</b> is the
   * same as <b>scale(3.0)</b>. If <b>scale()</b> is called within
   * <b>draw()</b>, the transformation is reset when the loop begins again.
   * Using this fuction with the <b>z</b> parameter requires using P3D as a
   * parameter for <b>size()</b> as shown in the example above. This function
   * can be further controlled by <b>pushMatrix()</b> and <b>popMatrix()</b>.
   *
   * ( end auto-generated )
   *
   * @webref transform
   * @param s percentage to scale the object
   * @see PGraphics#pushMatrix()
   * @see PGraphics#popMatrix()
   * @see PGraphics#translate(float, float, float)
   * @see PGraphics#rotate(float)
   * @see PGraphics#rotateX(float)
   * @see PGraphics#rotateY(float)
   * @see PGraphics#rotateZ(float)
   */
  public void scale(float s) {
    g.scale(s);
  }


  /**
   * <h3>Advanced</h3>
   * Scale in X and Y. Equivalent to scale(sx, sy, 1).
   *
   * Not recommended for use in 3D, because the z-dimension is just
   * scaled by 1, since there's no way to know what else to scale it by.
   *
   * @param x percentage to scale the object in the x-axis
   * @param y percentage to scale the object in the y-axis
   */
  public void scale(float x, float y) {
    g.scale(x, y);
  }


  /**
   * @param z percentage to scale the object in the z-axis
   */
  public void scale(float x, float y, float z) {
    g.scale(x, y, z);
  }


  /**
   * ( begin auto-generated from shearX.xml )
   *
   * Shears a shape around the x-axis the amount specified by the
   * <b>angle</b> parameter. Angles should be specified in radians (values
   * from 0 to PI*2) or converted to radians with the <b>radians()</b>
   * function. Objects are always sheared around their relative position to
   * the origin and positive numbers shear objects in a clockwise direction.
   * Transformations apply to everything that happens after and subsequent
   * calls to the function accumulates the effect. For example, calling
   * <b>shearX(PI/2)</b> and then <b>shearX(PI/2)</b> is the same as
   * <b>shearX(PI)</b>. If <b>shearX()</b> is called within the
   * <b>draw()</b>, the transformation is reset when the loop begins again.
   * <br/> <br/>
   * Technically, <b>shearX()</b> multiplies the current transformation
   * matrix by a rotation matrix. This function can be further controlled by
   * the <b>pushMatrix()</b> and <b>popMatrix()</b> functions.
   *
   * ( end auto-generated )
   *
   * @webref transform
   * @param angle angle of shear specified in radians
   * @see PGraphics#popMatrix()
   * @see PGraphics#pushMatrix()
   * @see PGraphics#shearY(float)
   * @see PGraphics#scale(float, float, float)
   * @see PGraphics#translate(float, float, float)
   * @see PApplet#radians(float)
   */
  public void shearX(float angle) {
    g.shearX(angle);
  }


  /**
   * ( begin auto-generated from shearY.xml )
   *
   * Shears a shape around the y-axis the amount specified by the
   * <b>angle</b> parameter. Angles should be specified in radians (values
   * from 0 to PI*2) or converted to radians with the <b>radians()</b>
   * function. Objects are always sheared around their relative position to
   * the origin and positive numbers shear objects in a clockwise direction.
   * Transformations apply to everything that happens after and subsequent
   * calls to the function accumulates the effect. For example, calling
   * <b>shearY(PI/2)</b> and then <b>shearY(PI/2)</b> is the same as
   * <b>shearY(PI)</b>. If <b>shearY()</b> is called within the
   * <b>draw()</b>, the transformation is reset when the loop begins again.
   * <br/> <br/>
   * Technically, <b>shearY()</b> multiplies the current transformation
   * matrix by a rotation matrix. This function can be further controlled by
   * the <b>pushMatrix()</b> and <b>popMatrix()</b> functions.
   *
   * ( end auto-generated )
   *
   * @webref transform
   * @param angle angle of shear specified in radians
   * @see PGraphics#popMatrix()
   * @see PGraphics#pushMatrix()
   * @see PGraphics#shearX(float)
   * @see PGraphics#scale(float, float, float)
   * @see PGraphics#translate(float, float, float)
   * @see PApplet#radians(float)
   */
  public void shearY(float angle) {
    g.shearY(angle);
  }


  /**
   * ( begin auto-generated from resetMatrix.xml )
   *
   * Replaces the current matrix with the identity matrix. The equivalent
   * function in OpenGL is glLoadIdentity().
   *
   * ( end auto-generated )
   *
   * @webref transform
   * @see PGraphics#pushMatrix()
   * @see PGraphics#popMatrix()
   * @see PGraphics#applyMatrix(PMatrix)
   * @see PGraphics#printMatrix()
   */
  public void resetMatrix() {
    g.resetMatrix();
  }


  /**
   * ( begin auto-generated from applyMatrix.xml )
   *
   * Multiplies the current matrix by the one specified through the
   * parameters. This is very slow because it will try to calculate the
   * inverse of the transform, so avoid it whenever possible. The equivalent
   * function in OpenGL is glMultMatrix().
   *
   * ( end auto-generated )
   *
   * @webref transform
   * @source
   * @see PGraphics#pushMatrix()
   * @see PGraphics#popMatrix()
   * @see PGraphics#resetMatrix()
   * @see PGraphics#printMatrix()
   */
  public void applyMatrix(PMatrix source) {
    g.applyMatrix(source);
  }


  public void applyMatrix(PMatrix2D source) {
    g.applyMatrix(source);
  }


  /**
   * @param n00 numbers which define the 4x4 matrix to be multiplied
   * @param n01 numbers which define the 4x4 matrix to be multiplied
   * @param n02 numbers which define the 4x4 matrix to be multiplied
   * @param n10 numbers which define the 4x4 matrix to be multiplied
   * @param n11 numbers which define the 4x4 matrix to be multiplied
   * @param n12 numbers which define the 4x4 matrix to be multiplied
   */
  public void applyMatrix(float n00, float n01, float n02,
                          float n10, float n11, float n12) {
    g.applyMatrix(n00, n01, n02, n10, n11, n12);
  }


  public void applyMatrix(PMatrix3D source) {
    g.applyMatrix(source);
  }


  /**
   * @param n03 numbers which define the 4x4 matrix to be multiplied
   * @param n13 numbers which define the 4x4 matrix to be multiplied
   * @param n20 numbers which define the 4x4 matrix to be multiplied
   * @param n21 numbers which define the 4x4 matrix to be multiplied
   * @param n22 numbers which define the 4x4 matrix to be multiplied
   * @param n23 numbers which define the 4x4 matrix to be multiplied
   * @param n30 numbers which define the 4x4 matrix to be multiplied
   * @param n31 numbers which define the 4x4 matrix to be multiplied
   * @param n32 numbers which define the 4x4 matrix to be multiplied
   * @param n33 numbers which define the 4x4 matrix to be multiplied
   */
  public void applyMatrix(float n00, float n01, float n02, float n03,
                          float n10, float n11, float n12, float n13,
                          float n20, float n21, float n22, float n23,
                          float n30, float n31, float n32, float n33) {
    g.applyMatrix(n00, n01, n02, n03, n10, n11, n12, n13, n20, n21, n22, n23, n30, n31, n32, n33);
  }


  public PMatrix getMatrix() {
    return g.getMatrix();
  }


  /**
   * Copy the current transformation matrix into the specified target.
   * Pass in null to create a new matrix.
   */
  public PMatrix2D getMatrix(PMatrix2D target) {
    return g.getMatrix(target);
  }


  /**
   * Copy the current transformation matrix into the specified target.
   * Pass in null to create a new matrix.
   */
  public PMatrix3D getMatrix(PMatrix3D target) {
    return g.getMatrix(target);
  }


  /**
   * Set the current transformation matrix to the contents of another.
   */
  public void setMatrix(PMatrix source) {
    g.setMatrix(source);
  }


  /**
   * Set the current transformation to the contents of the specified source.
   */
  public void setMatrix(PMatrix2D source) {
    g.setMatrix(source);
  }


  /**
   * Set the current transformation to the contents of the specified source.
   */
  public void setMatrix(PMatrix3D source) {
    g.setMatrix(source);
  }


  /**
   * ( begin auto-generated from printMatrix.xml )
   *
   * Prints the current matrix to the Console (the text window at the bottom
   * of Processing).
   *
   * ( end auto-generated )
   *
   * @webref transform
   * @see PGraphics#pushMatrix()
   * @see PGraphics#popMatrix()
   * @see PGraphics#resetMatrix()
   * @see PGraphics#applyMatrix(PMatrix)
   */
  public void printMatrix() {
    g.printMatrix();
  }


  /**
   * ( begin auto-generated from beginCamera.xml )
   *
   * The <b>beginCamera()</b> and <b>endCamera()</b> functions enable
   * advanced customization of the camera space. The functions are useful if
   * you want to more control over camera movement, however for most users,
   * the <b>camera()</b> function will be sufficient.<br /><br />The camera
   * functions will replace any transformations (such as <b>rotate()</b> or
   * <b>translate()</b>) that occur before them in <b>draw()</b>, but they
   * will not automatically replace the camera transform itself. For this
   * reason, camera functions should be placed at the beginning of
   * <b>draw()</b> (so that transformations happen afterwards), and the
   * <b>camera()</b> function can be used after <b>beginCamera()</b> if you
   * want to reset the camera before applying transformations.<br /><br
   * />This function sets the matrix mode to the camera matrix so calls such
   * as <b>translate()</b>, <b>rotate()</b>, applyMatrix() and resetMatrix()
   * affect the camera. <b>beginCamera()</b> should always be used with a
   * following <b>endCamera()</b> and pairs of <b>beginCamera()</b> and
   * <b>endCamera()</b> cannot be nested.
   *
   * ( end auto-generated )
   *
   * @webref lights_camera:camera
   * @see PGraphics#camera()
   * @see PGraphics#endCamera()
   * @see PGraphics#applyMatrix(PMatrix)
   * @see PGraphics#resetMatrix()
   * @see PGraphics#translate(float, float, float)
   * @see PGraphics#scale(float, float, float)
   */
  public void beginCamera() {
    g.beginCamera();
  }


  /**
   * ( begin auto-generated from endCamera.xml )
   *
   * The <b>beginCamera()</b> and <b>endCamera()</b> functions enable
   * advanced customization of the camera space. Please see the reference for
   * <b>beginCamera()</b> for a description of how the functions are used.
   *
   * ( end auto-generated )
   *
   * @webref lights_camera:camera
   * @see PGraphics#beginCamera()
   * @see PGraphics#camera(float, float, float, float, float, float, float, float, float)
   */
  public void endCamera() {
    g.endCamera();
  }


  /**
   * ( begin auto-generated from camera.xml )
   *
   * Sets the position of the camera through setting the eye position, the
   * center of the scene, and which axis is facing upward. Moving the eye
   * position and the direction it is pointing (the center of the scene)
   * allows the images to be seen from different angles. The version without
   * any parameters sets the camera to the default position, pointing to the
   * center of the display window with the Y axis as up. The default values
   * are <b>camera(width/2.0, height/2.0, (height/2.0) / tan(PI*30.0 /
   * 180.0), width/2.0, height/2.0, 0, 0, 1, 0)</b>. This function is similar
   * to <b>gluLookAt()</b> in OpenGL, but it first clears the current camera settings.
   *
   * ( end auto-generated )
   *
   * @webref lights_camera:camera
   * @see PGraphics#beginCamera()
   * @see PGraphics#endCamera()
   * @see PGraphics#frustum(float, float, float, float, float, float)
   */
  public void camera() {
    g.camera();
  }


/**
 * @param eyeX x-coordinate for the eye
 * @param eyeY y-coordinate for the eye
 * @param eyeZ z-coordinate for the eye
 * @param centerX x-coordinate for the center of the scene
 * @param centerY y-coordinate for the center of the scene
 * @param centerZ z-coordinate for the center of the scene
 * @param upX usually 0.0, 1.0, or -1.0
 * @param upY usually 0.0, 1.0, or -1.0
 * @param upZ usually 0.0, 1.0, or -1.0
 */
  public void camera(float eyeX, float eyeY, float eyeZ,
                     float centerX, float centerY, float centerZ,
                     float upX, float upY, float upZ) {
    g.camera(eyeX, eyeY, eyeZ, centerX, centerY, centerZ, upX, upY, upZ);
  }


/**
   * ( begin auto-generated from printCamera.xml )
   *
   * Prints the current camera matrix to the Console (the text window at the
   * bottom of Processing).
   *
   * ( end auto-generated )
 * @webref lights_camera:camera
 * @see PGraphics#camera(float, float, float, float, float, float, float, float, float)
 */
  public void printCamera() {
    g.printCamera();
  }


  /**
   * ( begin auto-generated from ortho.xml )
   *
   * Sets an orthographic projection and defines a parallel clipping volume.
   * All objects with the same dimension appear the same size, regardless of
   * whether they are near or far from the camera. The parameters to this
   * function specify the clipping volume where left and right are the
   * minimum and maximum x values, top and bottom are the minimum and maximum
   * y values, and near and far are the minimum and maximum z values. If no
   * parameters are given, the default is used: ortho(0, width, 0, height,
   * -10, 10).
   *
   * ( end auto-generated )
   *
   * @webref lights_camera:camera
   */
  public void ortho() {
    g.ortho();
  }


  /**
   * @param left left plane of the clipping volume
   * @param right right plane of the clipping volume
   * @param bottom bottom plane of the clipping volume
   * @param top top plane of the clipping volume
   */
  public void ortho(float left, float right,
                    float bottom, float top) {
    g.ortho(left, right, bottom, top);
  }


  /**
   * @param near maximum distance from the origin to the viewer
   * @param far maximum distance from the origin away from the viewer
   */
  public void ortho(float left, float right,
                    float bottom, float top,
                    float near, float far) {
    g.ortho(left, right, bottom, top, near, far);
  }


  /**
   * ( begin auto-generated from perspective.xml )
   *
   * Sets a perspective projection applying foreshortening, making distant
   * objects appear smaller than closer ones. The parameters define a viewing
   * volume with the shape of truncated pyramid. Objects near to the front of
   * the volume appear their actual size, while farther objects appear
   * smaller. This projection simulates the perspective of the world more
   * accurately than orthographic projection. The version of perspective
   * without parameters sets the default perspective and the version with
   * four parameters allows the programmer to set the area precisely. The
   * default values are: perspective(PI/3.0, width/height, cameraZ/10.0,
   * cameraZ*10.0) where cameraZ is ((height/2.0) / tan(PI*60.0/360.0));
   *
   * ( end auto-generated )
   *
   * @webref lights_camera:camera
   */
  public void perspective() {
    g.perspective();
  }


  /**
   * @param fovy field-of-view angle (in radians) for vertical direction
   * @param aspect ratio of width to height
   * @param zNear z-position of nearest clipping plane
   * @param zFar z-position of farthest clipping plane
   */
  public void perspective(float fovy, float aspect, float zNear, float zFar) {
    g.perspective(fovy, aspect, zNear, zFar);
  }


  /**
   * ( begin auto-generated from frustum.xml )
   *
   * Sets a perspective matrix defined through the parameters. Works like
   * glFrustum, except it wipes out the current perspective matrix rather
   * than muliplying itself with it.
   *
   * ( end auto-generated )
   *
   * @webref lights_camera:camera
   * @param left left coordinate of the clipping plane
   * @param right right coordinate of the clipping plane
   * @param bottom bottom coordinate of the clipping plane
   * @param top top coordinate of the clipping plane
   * @param near near component of the clipping plane; must be greater than zero
   * @param far far component of the clipping plane; must be greater than the near value
   * @see PGraphics#camera(float, float, float, float, float, float, float, float, float)
   * @see PGraphics#beginCamera()
   * @see PGraphics#endCamera()
   * @see PGraphics#perspective(float, float, float, float)
   */
  public void frustum(float left, float right,
                      float bottom, float top,
                      float near, float far) {
    g.frustum(left, right, bottom, top, near, far);
  }


  /**
   * ( begin auto-generated from printProjection.xml )
   *
   * Prints the current projection matrix to the Console (the text window at
   * the bottom of Processing).
   *
   * ( end auto-generated )
   *
   * @webref lights_camera:camera
   * @see PGraphics#camera(float, float, float, float, float, float, float, float, float)
   */
  public void printProjection() {
    g.printProjection();
  }


  /**
   * ( begin auto-generated from screenX.xml )
   *
   * Takes a three-dimensional X, Y, Z position and returns the X value for
   * where it will appear on a (two-dimensional) screen.
   *
   * ( end auto-generated )
   *
   * @webref lights_camera:coordinates
   * @param x 3D x-coordinate to be mapped
   * @param y 3D y-coordinate to be mapped
   * @see PGraphics#screenY(float, float, float)
   * @see PGraphics#screenZ(float, float, float)
   */
  public float screenX(float x, float y) {
    return g.screenX(x, y);
  }


  /**
   * ( begin auto-generated from screenY.xml )
   *
   * Takes a three-dimensional X, Y, Z position and returns the Y value for
   * where it will appear on a (two-dimensional) screen.
   *
   * ( end auto-generated )
   *
   * @webref lights_camera:coordinates
   * @param x 3D x-coordinate to be mapped
   * @param y 3D y-coordinate to be mapped
   * @see PGraphics#screenX(float, float, float)
   * @see PGraphics#screenZ(float, float, float)
   */
  public float screenY(float x, float y) {
    return g.screenY(x, y);
  }


  /**
   * @param z 3D z-coordinate to be mapped
   */
  public float screenX(float x, float y, float z) {
    return g.screenX(x, y, z);
  }


  /**
   * @param z 3D z-coordinate to be mapped
   */
  public float screenY(float x, float y, float z) {
    return g.screenY(x, y, z);
  }


  /**
   * ( begin auto-generated from screenZ.xml )
   *
   * Takes a three-dimensional X, Y, Z position and returns the Z value for
   * where it will appear on a (two-dimensional) screen.
   *
   * ( end auto-generated )
   *
   * @webref lights_camera:coordinates
   * @param x 3D x-coordinate to be mapped
   * @param y 3D y-coordinate to be mapped
   * @param z 3D z-coordinate to be mapped
   * @see PGraphics#screenX(float, float, float)
   * @see PGraphics#screenY(float, float, float)
   */
  public float screenZ(float x, float y, float z) {
    return g.screenZ(x, y, z);
  }


  /**
   * ( begin auto-generated from modelX.xml )
   *
   * Returns the three-dimensional X, Y, Z position in model space. This
   * returns the X value for a given coordinate based on the current set of
   * transformations (scale, rotate, translate, etc.) The X value can be used
   * to place an object in space relative to the location of the original
   * point once the transformations are no longer in use.
   * <br/> <br/>
   * In the example, the <b>modelX()</b>, <b>modelY()</b>, and
   * <b>modelZ()</b> functions record the location of a box in space after
   * being placed using a series of translate and rotate commands. After
   * popMatrix() is called, those transformations no longer apply, but the
   * (x, y, z) coordinate returned by the model functions is used to place
   * another box in the same location.
   *
   * ( end auto-generated )
   *
   * @webref lights_camera:coordinates
   * @param x 3D x-coordinate to be mapped
   * @param y 3D y-coordinate to be mapped
   * @param z 3D z-coordinate to be mapped
   * @see PGraphics#modelY(float, float, float)
   * @see PGraphics#modelZ(float, float, float)
   */
  public float modelX(float x, float y, float z) {
    return g.modelX(x, y, z);
  }


  /**
   * ( begin auto-generated from modelY.xml )
   *
   * Returns the three-dimensional X, Y, Z position in model space. This
   * returns the Y value for a given coordinate based on the current set of
   * transformations (scale, rotate, translate, etc.) The Y value can be used
   * to place an object in space relative to the location of the original
   * point once the transformations are no longer in use.<br />
   * <br />
   * In the example, the <b>modelX()</b>, <b>modelY()</b>, and
   * <b>modelZ()</b> functions record the location of a box in space after
   * being placed using a series of translate and rotate commands. After
   * popMatrix() is called, those transformations no longer apply, but the
   * (x, y, z) coordinate returned by the model functions is used to place
   * another box in the same location.
   *
   * ( end auto-generated )
   *
   * @webref lights_camera:coordinates
   * @param x 3D x-coordinate to be mapped
   * @param y 3D y-coordinate to be mapped
   * @param z 3D z-coordinate to be mapped
   * @see PGraphics#modelX(float, float, float)
   * @see PGraphics#modelZ(float, float, float)
   */
  public float modelY(float x, float y, float z) {
    return g.modelY(x, y, z);
  }


  /**
   * ( begin auto-generated from modelZ.xml )
   *
   * Returns the three-dimensional X, Y, Z position in model space. This
   * returns the Z value for a given coordinate based on the current set of
   * transformations (scale, rotate, translate, etc.) The Z value can be used
   * to place an object in space relative to the location of the original
   * point once the transformations are no longer in use.<br />
   * <br />
   * In the example, the <b>modelX()</b>, <b>modelY()</b>, and
   * <b>modelZ()</b> functions record the location of a box in space after
   * being placed using a series of translate and rotate commands. After
   * popMatrix() is called, those transformations no longer apply, but the
   * (x, y, z) coordinate returned by the model functions is used to place
   * another box in the same location.
   *
   * ( end auto-generated )
   *
   * @webref lights_camera:coordinates
   * @param x 3D x-coordinate to be mapped
   * @param y 3D y-coordinate to be mapped
   * @param z 3D z-coordinate to be mapped
   * @see PGraphics#modelX(float, float, float)
   * @see PGraphics#modelY(float, float, float)
   */
  public float modelZ(float x, float y, float z) {
    return g.modelZ(x, y, z);
  }


  /**
   * ( begin auto-generated from pushStyle.xml )
   *
   * The <b>pushStyle()</b> function saves the current style settings and
   * <b>popStyle()</b> restores the prior settings. Note that these functions
   * are always used together. They allow you to change the style settings
   * and later return to what you had. When a new style is started with
   * <b>pushStyle()</b>, it builds on the current style information. The
   * <b>pushStyle()</b> and <b>popStyle()</b> functions can be embedded to
   * provide more control (see the second example above for a demonstration.)
   * <br /><br />
   * The style information controlled by the following functions are included
   * in the style:
   * fill(), stroke(), tint(), strokeWeight(), strokeCap(), strokeJoin(),
   * imageMode(), rectMode(), ellipseMode(), shapeMode(), colorMode(),
   * textAlign(), textFont(), textMode(), textSize(), textLeading(),
   * emissive(), specular(), shininess(), ambient()
   *
   * ( end auto-generated )
   *
   * @webref structure
   * @see PGraphics#popStyle()
   */
  public void pushStyle() {
    g.pushStyle();
  }


  /**
   * ( begin auto-generated from popStyle.xml )
   *
   * The <b>pushStyle()</b> function saves the current style settings and
   * <b>popStyle()</b> restores the prior settings; these functions are
   * always used together. They allow you to change the style settings and
   * later return to what you had. When a new style is started with
   * <b>pushStyle()</b>, it builds on the current style information. The
   * <b>pushStyle()</b> and <b>popStyle()</b> functions can be embedded to
   * provide more control (see the second example above for a demonstration.)
   *
   * ( end auto-generated )
   *
   * @webref structure
   * @see PGraphics#pushStyle()
   */
  public void popStyle() {
    g.popStyle();
  }


  public void style(PStyle s) {
    g.style(s);
  }


  /**
   * ( begin auto-generated from strokeWeight.xml )
   *
   * Sets the width of the stroke used for lines, points, and the border
   * around shapes. All widths are set in units of pixels.
   * <br/> <br/>
   * When drawing with P3D, series of connected lines (such as the stroke
   * around a polygon, triangle, or ellipse) produce unattractive results
   * when a thick stroke weight is set (<a
   * href="http://code.google.com/p/processing/issues/detail?id=123">see
   * Issue 123</a>). With P3D, the minimum and maximum values for
   * <b>strokeWeight()</b> are controlled by the graphics card and the
   * operating system's OpenGL implementation. For instance, the thickness
   * may not go higher than 10 pixels.
   *
   * ( end auto-generated )
   *
   * @webref shape:attributes
   * @param weight the weight (in pixels) of the stroke
   * @see PGraphics#stroke(int, float)
   * @see PGraphics#strokeJoin(int)
   * @see PGraphics#strokeCap(int)
   */
  public void strokeWeight(float weight) {
    g.strokeWeight(weight);
  }


  /**
   * ( begin auto-generated from strokeJoin.xml )
   *
   * Sets the style of the joints which connect line segments. These joints
   * are either mitered, beveled, or rounded and specified with the
   * corresponding parameters MITER, BEVEL, and ROUND. The default joint is
   * MITER.
   * <br/> <br/>
   * This function is not available with the P3D renderer, (<a
   * href="http://code.google.com/p/processing/issues/detail?id=123">see
   * Issue 123</a>). More information about the renderers can be found in the
   * <b>size()</b> reference.
   *
   * ( end auto-generated )
   *
   * @webref shape:attributes
   * @param join either MITER, BEVEL, ROUND
   * @see PGraphics#stroke(int, float)
   * @see PGraphics#strokeWeight(float)
   * @see PGraphics#strokeCap(int)
   */
  public void strokeJoin(int join) {
    g.strokeJoin(join);
  }


  /**
   * ( begin auto-generated from strokeCap.xml )
   *
   * Sets the style for rendering line endings. These ends are either
   * squared, extended, or rounded and specified with the corresponding
   * parameters SQUARE, PROJECT, and ROUND. The default cap is ROUND.
   * <br/> <br/>
   * This function is not available with the P3D renderer (<a
   * href="http://code.google.com/p/processing/issues/detail?id=123">see
   * Issue 123</a>). More information about the renderers can be found in the
   * <b>size()</b> reference.
   *
   * ( end auto-generated )
   *
   * @webref shape:attributes
   * @param cap either SQUARE, PROJECT, or ROUND
   * @see PGraphics#stroke(int, float)
   * @see PGraphics#strokeWeight(float)
   * @see PGraphics#strokeJoin(int)
   * @see PApplet#size(int, int, String, String)
   */
  public void strokeCap(int cap) {
    g.strokeCap(cap);
  }


  /**
   * ( begin auto-generated from noStroke.xml )
   *
   * Disables drawing the stroke (outline). If both <b>noStroke()</b> and
   * <b>noFill()</b> are called, nothing will be drawn to the screen.
   *
   * ( end auto-generated )
   *
   * @webref color:setting
   * @see PGraphics#stroke(int, float)
   * @see PGraphics#fill(float, float, float, float)
   * @see PGraphics#noFill()
   */
  public void noStroke() {
    g.noStroke();
  }


  /**
   * ( begin auto-generated from stroke.xml )
   *
   * Sets the color used to draw lines and borders around shapes. This color
   * is either specified in terms of the RGB or HSB color depending on the
   * current <b>colorMode()</b> (the default color space is RGB, with each
   * value in the range from 0 to 255).
   * <br/> <br/>
   * When using hexadecimal notation to specify a color, use "#" or "0x"
   * before the values (e.g. #CCFFAA, 0xFFCCFFAA). The # syntax uses six
   * digits to specify a color (the way colors are specified in HTML and
   * CSS). When using the hexadecimal notation starting with "0x", the
   * hexadecimal value must be specified with eight characters; the first two
   * characters define the alpha component and the remainder the red, green,
   * and blue components.
   * <br/> <br/>
   * The value for the parameter "gray" must be less than or equal to the
   * current maximum value as specified by <b>colorMode()</b>. The default
   * maximum value is 255.
   *
   * ( end auto-generated )
   *
   * @param rgb color value in hexadecimal notation
   * @see PGraphics#noStroke()
   * @see PGraphics#strokeWeight(float)
   * @see PGraphics#strokeJoin(int)
   * @see PGraphics#strokeCap(int)
   * @see PGraphics#fill(int, float)
   * @see PGraphics#noFill()
   * @see PGraphics#tint(int, float)
   * @see PGraphics#background(float, float, float, float)
   * @see PGraphics#colorMode(int, float, float, float, float)
   */
  public void stroke(int rgb) {
    g.stroke(rgb);
  }


  /**
   * @param alpha opacity of the stroke
   */
  public void stroke(int rgb, float alpha) {
    g.stroke(rgb, alpha);
  }


  /**
   * @param gray specifies a value between white and black
   */
  public void stroke(float gray) {
    g.stroke(gray);
  }


  public void stroke(float gray, float alpha) {
    g.stroke(gray, alpha);
  }


  /**
   * @param v1 red or hue value (depending on current color mode)
   * @param v2 green or saturation value (depending on current color mode)
   * @param v3 blue or brightness value (depending on current color mode)
   * @webref color:setting
   */
  public void stroke(float v1, float v2, float v3) {
    g.stroke(v1, v2, v3);
  }


  public void stroke(float v1, float v2, float v3, float alpha) {
    g.stroke(v1, v2, v3, alpha);
  }


  /**
   * ( begin auto-generated from noTint.xml )
   *
   * Removes the current fill value for displaying images and reverts to
   * displaying images with their original hues.
   *
   * ( end auto-generated )
   *
   * @webref image:loading_displaying
   * @usage web_application
   * @see PGraphics#tint(float, float, float, float)
   * @see PGraphics#image(PImage, float, float, float, float)
   */
  public void noTint() {
    g.noTint();
  }


  /**
   * ( begin auto-generated from tint.xml )
   *
   * Sets the fill value for displaying images. Images can be tinted to
   * specified colors or made transparent by setting the alpha.<br />
   * <br />
   * To make an image transparent, but not change it's color, use white as
   * the tint color and specify an alpha value. For instance, tint(255, 128)
   * will make an image 50% transparent (unless <b>colorMode()</b> has been
   * used).<br />
   * <br />
   * When using hexadecimal notation to specify a color, use "#" or "0x"
   * before the values (e.g. #CCFFAA, 0xFFCCFFAA). The # syntax uses six
   * digits to specify a color (the way colors are specified in HTML and
   * CSS). When using the hexadecimal notation starting with "0x", the
   * hexadecimal value must be specified with eight characters; the first two
   * characters define the alpha component and the remainder the red, green,
   * and blue components.<br />
   * <br />
   * The value for the parameter "gray" must be less than or equal to the
   * current maximum value as specified by <b>colorMode()</b>. The default
   * maximum value is 255.<br />
   * <br />
   * The <b>tint()</b> function is also used to control the coloring of
   * textures in 3D.
   *
   * ( end auto-generated )
   *
   * @webref image:loading_displaying
   * @usage web_application
   * @param rgb color value in hexadecimal notation
   * @see PGraphics#noTint()
   * @see PGraphics#image(PImage, float, float, float, float)
   */
  public void tint(int rgb) {
    g.tint(rgb);
  }


  /**
   * @param alpha opacity of the image
   */
  public void tint(int rgb, float alpha) {
    g.tint(rgb, alpha);
  }


  /**
   * @param gray specifies a value between white and black
   */
  public void tint(float gray) {
    g.tint(gray);
  }


  public void tint(float gray, float alpha) {
    g.tint(gray, alpha);
  }


/**
 * @param v1 red or hue value (depending on current color mode)
 * @param v2 green or saturation value (depending on current color mode)
 * @param v3 blue or brightness value (depending on current color mode)
 */
  public void tint(float v1, float v2, float v3) {
    g.tint(v1, v2, v3);
  }


  public void tint(float v1, float v2, float v3, float alpha) {
    g.tint(v1, v2, v3, alpha);
  }


  /**
   * ( begin auto-generated from noFill.xml )
   *
   * Disables filling geometry. If both <b>noStroke()</b> and <b>noFill()</b>
   * are called, nothing will be drawn to the screen.
   *
   * ( end auto-generated )
   *
   * @webref color:setting
   * @usage web_application
   * @see PGraphics#fill(float, float, float, float)
   * @see PGraphics#stroke(int, float)
   * @see PGraphics#noStroke()
   */
  public void noFill() {
    g.noFill();
  }


  /**
   * ( begin auto-generated from fill.xml )
   *
   * Sets the color used to fill shapes. For example, if you run <b>fill(204,
   * 102, 0)</b>, all subsequent shapes will be filled with orange. This
   * color is either specified in terms of the RGB or HSB color depending on
   * the current <b>colorMode()</b> (the default color space is RGB, with
   * each value in the range from 0 to 255).
   * <br/> <br/>
   * When using hexadecimal notation to specify a color, use "#" or "0x"
   * before the values (e.g. #CCFFAA, 0xFFCCFFAA). The # syntax uses six
   * digits to specify a color (the way colors are specified in HTML and
   * CSS). When using the hexadecimal notation starting with "0x", the
   * hexadecimal value must be specified with eight characters; the first two
   * characters define the alpha component and the remainder the red, green,
   * and blue components.
   * <br/> <br/>
   * The value for the parameter "gray" must be less than or equal to the
   * current maximum value as specified by <b>colorMode()</b>. The default
   * maximum value is 255.
   * <br/> <br/>
   * To change the color of an image (or a texture), use tint().
   *
   * ( end auto-generated )
   *
   * @webref color:setting
   * @usage web_application
   * @param rgb color variable or hex value
   * @see PGraphics#noFill()
   * @see PGraphics#stroke(int, float)
   * @see PGraphics#noStroke()
   * @see PGraphics#tint(int, float)
   * @see PGraphics#background(float, float, float, float)
   * @see PGraphics#colorMode(int, float, float, float, float)
   */
  public void fill(int rgb) {
    g.fill(rgb);
  }


  /**
   * @param alpha opacity of the fill
   */
  public void fill(int rgb, float alpha) {
    g.fill(rgb, alpha);
  }


  /**
   * @param gray number specifying value between white and black
   */
  public void fill(float gray) {
    g.fill(gray);
  }


  public void fill(float gray, float alpha) {
    g.fill(gray, alpha);
  }


  /**
   * @param v1 red or hue value (depending on current color mode)
   * @param v2 green or saturation value (depending on current color mode)
   * @param v3 blue or brightness value (depending on current color mode)
   */
  public void fill(float v1, float v2, float v3) {
    g.fill(v1, v2, v3);
  }


  public void fill(float v1, float v2, float v3, float alpha) {
    g.fill(v1, v2, v3, alpha);
  }


  /**
   * ( begin auto-generated from ambient.xml )
   *
   * Sets the ambient reflectance for shapes drawn to the screen. This is
   * combined with the ambient light component of environment. The color
   * components set through the parameters define the reflectance. For
   * example in the default color mode, setting v1=255, v2=126, v3=0, would
   * cause all the red light to reflect and half of the green light to
   * reflect. Used in combination with <b>emissive()</b>, <b>specular()</b>,
   * and <b>shininess()</b> in setting the material properties of shapes.
   *
   * ( end auto-generated )
   *
   * @webref lights_camera:material_properties
   * @usage web_application
   * @param rgb any value of the color datatype
   * @see PGraphics#emissive(float, float, float)
   * @see PGraphics#specular(float, float, float)
   * @see PGraphics#shininess(float)
   */
  public void ambient(int rgb) {
    g.ambient(rgb);
  }


/**
 * @param gray number specifying value between white and black
 */
  public void ambient(float gray) {
    g.ambient(gray);
  }


/**
 * @param v1 red or hue value (depending on current color mode)
 * @param v2 green or saturation value (depending on current color mode)
 * @param v3 blue or brightness value (depending on current color mode)
 */
  public void ambient(float v1, float v2, float v3) {
    g.ambient(v1, v2, v3);
  }


  /**
   * ( begin auto-generated from specular.xml )
   *
   * Sets the specular color of the materials used for shapes drawn to the
   * screen, which sets the color of hightlights. Specular refers to light
   * which bounces off a surface in a perferred direction (rather than
   * bouncing in all directions like a diffuse light). Used in combination
   * with <b>emissive()</b>, <b>ambient()</b>, and <b>shininess()</b> in
   * setting the material properties of shapes.
   *
   * ( end auto-generated )
   *
   * @webref lights_camera:material_properties
   * @usage web_application
   * @param rgb color to set
   * @see PGraphics#lightSpecular(float, float, float)
   * @see PGraphics#ambient(float, float, float)
   * @see PGraphics#emissive(float, float, float)
   * @see PGraphics#shininess(float)
   */
  public void specular(int rgb) {
    g.specular(rgb);
  }


/**
 * gray number specifying value between white and black
 */
  public void specular(float gray) {
    g.specular(gray);
  }


/**
 * @param v1 red or hue value (depending on current color mode)
 * @param v2 green or saturation value (depending on current color mode)
 * @param v3 blue or brightness value (depending on current color mode)
 */
  public void specular(float v1, float v2, float v3) {
    g.specular(v1, v2, v3);
  }


  /**
   * ( begin auto-generated from shininess.xml )
   *
   * Sets the amount of gloss in the surface of shapes. Used in combination
   * with <b>ambient()</b>, <b>specular()</b>, and <b>emissive()</b> in
   * setting the material properties of shapes.
   *
   * ( end auto-generated )
   *
   * @webref lights_camera:material_properties
   * @usage web_application
   * @param shine degree of shininess
   * @see PGraphics#emissive(float, float, float)
   * @see PGraphics#ambient(float, float, float)
   * @see PGraphics#specular(float, float, float)
   */
  public void shininess(float shine) {
    g.shininess(shine);
  }


  /**
   * ( begin auto-generated from emissive.xml )
   *
   * Sets the emissive color of the material used for drawing shapes drawn to
   * the screen. Used in combination with <b>ambient()</b>,
   * <b>specular()</b>, and <b>shininess()</b> in setting the material
   * properties of shapes.
   *
   * ( end auto-generated )
   *
   * @webref lights_camera:material_properties
   * @usage web_application
   * @param rgb color to set
   * @see PGraphics#ambient(float, float, float)
   * @see PGraphics#specular(float, float, float)
   * @see PGraphics#shininess(float)
   */
  public void emissive(int rgb) {
    g.emissive(rgb);
  }


  /**
   * gray number specifying value between white and black
   */
  public void emissive(float gray) {
    g.emissive(gray);
  }


  /**
   * @param v1 red or hue value (depending on current color mode)
   * @param v2 green or saturation value (depending on current color mode)
   * @param v3 blue or brightness value (depending on current color mode)
   */
  public void emissive(float v1, float v2, float v3) {
    g.emissive(v1, v2, v3);
  }


  /**
   * ( begin auto-generated from lights.xml )
   *
   * Sets the default ambient light, directional light, falloff, and specular
   * values. The defaults are ambientLight(128, 128, 128) and
   * directionalLight(128, 128, 128, 0, 0, -1), lightFalloff(1, 0, 0), and
   * lightSpecular(0, 0, 0). Lights need to be included in the draw() to
   * remain persistent in a looping program. Placing them in the setup() of a
   * looping program will cause them to only have an effect the first time
   * through the loop.
   *
   * ( end auto-generated )
   *
   * @webref lights_camera:lights
   * @usage web_application
   * @see PGraphics#ambientLight(float, float, float, float, float, float)
   * @see PGraphics#directionalLight(float, float, float, float, float, float)
   * @see PGraphics#pointLight(float, float, float, float, float, float)
   * @see PGraphics#spotLight(float, float, float, float, float, float, float, float, float, float, float)
   * @see PGraphics#noLights()
   */
  public void lights() {
    g.lights();
  }


  /**
   * ( begin auto-generated from noLights.xml )
   *
   * Disable all lighting. Lighting is turned off by default and enabled with
   * the <b>lights()</b> function. This function can be used to disable
   * lighting so that 2D geometry (which does not require lighting) can be
   * drawn after a set of lighted 3D geometry.
   *
   * ( end auto-generated )
   *
   * @webref lights_camera:lights
   * @usage web_application
   * @see PGraphics#lights()
   */
  public void noLights() {
    g.noLights();
  }


  /**
   * ( begin auto-generated from ambientLight.xml )
   *
   * Adds an ambient light. Ambient light doesn't come from a specific
   * direction, the rays have light have bounced around so much that objects
   * are evenly lit from all sides. Ambient lights are almost always used in
   * combination with other types of lights. Lights need to be included in
   * the <b>draw()</b> to remain persistent in a looping program. Placing
   * them in the <b>setup()</b> of a looping program will cause them to only
   * have an effect the first time through the loop. The effect of the
   * parameters is determined by the current color mode.
   *
   * ( end auto-generated )
   *
   * @webref lights_camera:lights
   * @usage web_application
   * @param v1 red or hue value (depending on current color mode)
   * @param v2 green or saturation value (depending on current color mode)
   * @param v3 blue or brightness value (depending on current color mode)
   * @see PGraphics#lights()
   * @see PGraphics#directionalLight(float, float, float, float, float, float)
   * @see PGraphics#pointLight(float, float, float, float, float, float)
   * @see PGraphics#spotLight(float, float, float, float, float, float, float, float, float, float, float)
   */
  public void ambientLight(float v1, float v2, float v3) {
    g.ambientLight(v1, v2, v3);
  }


  /**
   * @param x x-coordinate of the light
   * @param y y-coordinate of the light
   * @param z z-coordinate of the light
   */
  public void ambientLight(float v1, float v2, float v3,
                           float x, float y, float z) {
    g.ambientLight(v1, v2, v3, x, y, z);
  }


  /**
   * ( begin auto-generated from directionalLight.xml )
   *
   * Adds a directional light. Directional light comes from one direction and
   * is stronger when hitting a surface squarely and weaker if it hits at a a
   * gentle angle. After hitting a surface, a directional lights scatters in
   * all directions. Lights need to be included in the <b>draw()</b> to
   * remain persistent in a looping program. Placing them in the
   * <b>setup()</b> of a looping program will cause them to only have an
   * effect the first time through the loop. The affect of the <b>v1</b>,
   * <b>v2</b>, and <b>v3</b> parameters is determined by the current color
   * mode. The <b>nx</b>, <b>ny</b>, and <b>nz</b> parameters specify the
   * direction the light is facing. For example, setting <b>ny</b> to -1 will
   * cause the geometry to be lit from below (the light is facing directly upward).
   *
   * ( end auto-generated )
   *
   * @webref lights_camera:lights
   * @usage web_application
   * @param v1 red or hue value (depending on current color mode)
   * @param v2 green or saturation value (depending on current color mode)
   * @param v3 blue or brightness value (depending on current color mode)
   * @param nx direction along the x-axis
   * @param ny direction along the y-axis
   * @param nz direction along the z-axis
   * @see PGraphics#lights()
   * @see PGraphics#ambientLight(float, float, float, float, float, float)
   * @see PGraphics#pointLight(float, float, float, float, float, float)
   * @see PGraphics#spotLight(float, float, float, float, float, float, float, float, float, float, float)
   */
  public void directionalLight(float v1, float v2, float v3,
                               float nx, float ny, float nz) {
    g.directionalLight(v1, v2, v3, nx, ny, nz);
  }


  /**
   * ( begin auto-generated from pointLight.xml )
   *
   * Adds a point light. Lights need to be included in the <b>draw()</b> to
   * remain persistent in a looping program. Placing them in the
   * <b>setup()</b> of a looping program will cause them to only have an
   * effect the first time through the loop. The affect of the <b>v1</b>,
   * <b>v2</b>, and <b>v3</b> parameters is determined by the current color
   * mode. The <b>x</b>, <b>y</b>, and <b>z</b> parameters set the position
   * of the light.
   *
   * ( end auto-generated )
   *
   * @webref lights_camera:lights
   * @usage web_application
   * @param v1 red or hue value (depending on current color mode)
   * @param v2 green or saturation value (depending on current color mode)
   * @param v3 blue or brightness value (depending on current color mode)
   * @param x x-coordinate of the light
   * @param y y-coordinate of the light
   * @param z z-coordinate of the light
   * @see PGraphics#lights()
   * @see PGraphics#directionalLight(float, float, float, float, float, float)
   * @see PGraphics#ambientLight(float, float, float, float, float, float)
   * @see PGraphics#spotLight(float, float, float, float, float, float, float, float, float, float, float)
   */
  public void pointLight(float v1, float v2, float v3,
                         float x, float y, float z) {
    g.pointLight(v1, v2, v3, x, y, z);
  }


  /**
   * ( begin auto-generated from spotLight.xml )
   *
   * Adds a spot light. Lights need to be included in the <b>draw()</b> to
   * remain persistent in a looping program. Placing them in the
   * <b>setup()</b> of a looping program will cause them to only have an
   * effect the first time through the loop. The affect of the <b>v1</b>,
   * <b>v2</b>, and <b>v3</b> parameters is determined by the current color
   * mode. The <b>x</b>, <b>y</b>, and <b>z</b> parameters specify the
   * position of the light and <b>nx</b>, <b>ny</b>, <b>nz</b> specify the
   * direction or light. The <b>angle</b> parameter affects angle of the
   * spotlight cone.
   *
   * ( end auto-generated )
   *
   * @webref lights_camera:lights
   * @usage web_application
   * @param v1 red or hue value (depending on current color mode)
   * @param v2 green or saturation value (depending on current color mode)
   * @param v3 blue or brightness value (depending on current color mode)
   * @param x x-coordinate of the light
   * @param y y-coordinate of the light
   * @param z z-coordinate of the light
   * @param nx direction along the x axis
   * @param ny direction along the y axis
   * @param nz direction along the z axis
   * @param angle angle of the spotlight cone
   * @param concentration exponent determining the center bias of the cone
   * @see PGraphics#lights()
   * @see PGraphics#directionalLight(float, float, float, float, float, float)
   * @see PGraphics#pointLight(float, float, float, float, float, float)
   * @see PGraphics#ambientLight(float, float, float, float, float, float)
   */
  public void spotLight(float v1, float v2, float v3,
                        float x, float y, float z,
                        float nx, float ny, float nz,
                        float angle, float concentration) {
    g.spotLight(v1, v2, v3, x, y, z, nx, ny, nz, angle, concentration);
  }


  /**
   * ( begin auto-generated from lightFalloff.xml )
   *
   * Sets the falloff rates for point lights, spot lights, and ambient
   * lights. The parameters are used to determine the falloff with the
   * following equation:<br /><br />d = distance from light position to
   * vertex position<br />falloff = 1 / (CONSTANT + d * LINEAR + (d*d) *
   * QUADRATIC)<br /><br />Like <b>fill()</b>, it affects only the elements
   * which are created after it in the code. The default value if
   * <b>LightFalloff(1.0, 0.0, 0.0)</b>. Thinking about an ambient light with
   * a falloff can be tricky. It is used, for example, if you wanted a region
   * of your scene to be lit ambiently one color and another region to be lit
   * ambiently by another color, you would use an ambient light with location
   * and falloff. You can think of it as a point light that doesn't care
   * which direction a surface is facing.
   *
   * ( end auto-generated )
   *
   * @webref lights_camera:lights
   * @usage web_application
   * @param constant constant value or determining falloff
   * @param linear linear value for determining falloff
   * @param quadratic quadratic value for determining falloff
   * @see PGraphics#lights()
   * @see PGraphics#ambientLight(float, float, float, float, float, float)
   * @see PGraphics#pointLight(float, float, float, float, float, float)
   * @see PGraphics#spotLight(float, float, float, float, float, float, float, float, float, float, float)
   * @see PGraphics#lightSpecular(float, float, float)
   */
  public void lightFalloff(float constant, float linear, float quadratic) {
    g.lightFalloff(constant, linear, quadratic);
  }


  /**
   * ( begin auto-generated from lightSpecular.xml )
   *
   * Sets the specular color for lights. Like <b>fill()</b>, it affects only
   * the elements which are created after it in the code. Specular refers to
   * light which bounces off a surface in a perferred direction (rather than
   * bouncing in all directions like a diffuse light) and is used for
   * creating highlights. The specular quality of a light interacts with the
   * specular material qualities set through the <b>specular()</b> and
   * <b>shininess()</b> functions.
   *
   * ( end auto-generated )
   *
   * @webref lights_camera:lights
   * @usage web_application
   * @param v1 red or hue value (depending on current color mode)
   * @param v2 green or saturation value (depending on current color mode)
   * @param v3 blue or brightness value (depending on current color mode)
   * @see PGraphics#specular(float, float, float)
   * @see PGraphics#lights()
   * @see PGraphics#ambientLight(float, float, float, float, float, float)
   * @see PGraphics#pointLight(float, float, float, float, float, float)
   * @see PGraphics#spotLight(float, float, float, float, float, float, float, float, float, float, float)
   */
  public void lightSpecular(float v1, float v2, float v3) {
    g.lightSpecular(v1, v2, v3);
  }


  /**
   * ( begin auto-generated from background.xml )
   *
   * The <b>background()</b> function sets the color used for the background
   * of the Processing window. The default background is light gray. In the
   * <b>draw()</b> function, the background color is used to clear the
   * display window at the beginning of each frame.
   * <br/> <br/>
   * An image can also be used as the background for a sketch, however its
   * width and height must be the same size as the sketch window. To resize
   * an image 'b' to the size of the sketch window, use b.resize(width, height).
   * <br/> <br/>
   * Images used as background will ignore the current <b>tint()</b> setting.
   * <br/> <br/>
   * It is not possible to use transparency (alpha) in background colors with
   * the main drawing surface, however they will work properly with <b>createGraphics()</b>.
   *
   * ( end auto-generated )
   *
   * <h3>Advanced</h3>
   * <p>Clear the background with a color that includes an alpha value. This can
   * only be used with objects created by createGraphics(), because the main
   * drawing surface cannot be set transparent.</p>
   * <p>It might be tempting to use this function to partially clear the screen
   * on each frame, however that's not how this function works. When calling
   * background(), the pixels will be replaced with pixels that have that level
   * of transparency. To do a semi-transparent overlay, use fill() with alpha
   * and draw a rectangle.</p>
   *
   * @webref color:setting
   * @usage web_application
   * @param rgb any value of the color datatype
   * @see PGraphics#stroke(float)
   * @see PGraphics#fill(float)
   * @see PGraphics#tint(float)
   * @see PGraphics#colorMode(int)
   */
  public void background(int rgb) {
    g.background(rgb);
  }


  /**
   * @param alpha opacity of the background
   */
  public void background(int rgb, float alpha) {
    g.background(rgb, alpha);
  }


  /**
   * @param gray specifies a value between white and black
   */
  public void background(float gray) {
    g.background(gray);
  }


  public void background(float gray, float alpha) {
    g.background(gray, alpha);
  }


  /**
   * @param v1 red or hue value (depending on the current color mode)
   * @param v2 green or saturation value (depending on the current color mode)
   * @param v3 blue or brightness value (depending on the current color mode)
   */
  public void background(float v1, float v2, float v3) {
    g.background(v1, v2, v3);
  }


  public void background(float v1, float v2, float v3, float alpha) {
    g.background(v1, v2, v3, alpha);
  }


  /**
   * @webref color:setting
   */
  public void clear() {
    g.clear();
  }


  /**
   * Takes an RGB or ARGB image and sets it as the background.
   * The width and height of the image must be the same size as the sketch.
   * Use image.resize(width, height) to make short work of such a task.<br/>
   * <br/>
   * Note that even if the image is set as RGB, the high 8 bits of each pixel
   * should be set opaque (0xFF000000) because the image data will be copied
   * directly to the screen, and non-opaque background images may have strange
   * behavior. Use image.filter(OPAQUE) to handle this easily.<br/>
   * <br/>
   * When using 3D, this will also clear the zbuffer (if it exists).
   *
   * @param image PImage to set as background (must be same size as the sketch window)
   */
  public void background(PImage image) {
    g.background(image);
  }


  /**
   * ( begin auto-generated from colorMode.xml )
   *
   * Changes the way Processing interprets color data. By default, the
   * parameters for <b>fill()</b>, <b>stroke()</b>, <b>background()</b>, and
   * <b>color()</b> are defined by values between 0 and 255 using the RGB
   * color model. The <b>colorMode()</b> function is used to change the
   * numerical range used for specifying colors and to switch color systems.
   * For example, calling <b>colorMode(RGB, 1.0)</b> will specify that values
   * are specified between 0 and 1. The limits for defining colors are
   * altered by setting the parameters range1, range2, range3, and range 4.
   *
   * ( end auto-generated )
   *
   * @webref color:setting
   * @usage web_application
   * @param mode Either RGB or HSB, corresponding to Red/Green/Blue and Hue/Saturation/Brightness
   * @see PGraphics#background(float)
   * @see PGraphics#fill(float)
   * @see PGraphics#stroke(float)
   */
  public void colorMode(int mode) {
    g.colorMode(mode);
  }


  /**
   * @param max range for all color elements
   */
  public void colorMode(int mode, float max) {
    g.colorMode(mode, max);
  }


  /**
   * @param max1 range for the red or hue depending on the current color mode
   * @param max2 range for the green or saturation depending on the current color mode
   * @param max3 range for the blue or brightness depending on the current color mode
   */
  public void colorMode(int mode, float max1, float max2, float max3) {
    g.colorMode(mode, max1, max2, max3);
  }


  /**
   * @param maxA range for the alpha
   */
  public void colorMode(int mode,
                        float max1, float max2, float max3, float maxA) {
    g.colorMode(mode, max1, max2, max3, maxA);
  }


  /**
   * ( begin auto-generated from alpha.xml )
   *
   * Extracts the alpha value from a color.
   *
   * ( end auto-generated )
   * @webref color:creating_reading
   * @usage web_application
   * @param rgb any value of the color datatype
   * @see PGraphics#red(int)
   * @see PGraphics#green(int)
   * @see PGraphics#blue(int)
   * @see PGraphics#hue(int)
   * @see PGraphics#saturation(int)
   * @see PGraphics#brightness(int)
   */
  public final float alpha(int rgb) {
    return g.alpha(rgb);
  }


  /**
   * ( begin auto-generated from red.xml )
   *
   * Extracts the red value from a color, scaled to match current
   * <b>colorMode()</b>. This value is always returned as a  float so be
   * careful not to assign it to an int value.<br /><br />The red() function
   * is easy to use and undestand, but is slower than another technique. To
   * achieve the same results when working in <b>colorMode(RGB, 255)</b>, but
   * with greater speed, use the &gt;&gt; (right shift) operator with a bit
   * mask. For example, the following two lines of code are equivalent:<br
   * /><pre>float r1 = red(myColor);<br />float r2 = myColor &gt;&gt; 16
   * &amp; 0xFF;</pre>
   *
   * ( end auto-generated )
   *
   * @webref color:creating_reading
   * @usage web_application
   * @param rgb any value of the color datatype
   * @see PGraphics#green(int)
   * @see PGraphics#blue(int)
   * @see PGraphics#alpha(int)
   * @see PGraphics#hue(int)
   * @see PGraphics#saturation(int)
   * @see PGraphics#brightness(int)
   * @see_external rightshift
   */
  public final float red(int rgb) {
    return g.red(rgb);
  }


  /**
   * ( begin auto-generated from green.xml )
   *
   * Extracts the green value from a color, scaled to match current
   * <b>colorMode()</b>. This value is always returned as a  float so be
   * careful not to assign it to an int value.<br /><br />The <b>green()</b>
   * function is easy to use and undestand, but is slower than another
   * technique. To achieve the same results when working in <b>colorMode(RGB,
   * 255)</b>, but with greater speed, use the &gt;&gt; (right shift)
   * operator with a bit mask. For example, the following two lines of code
   * are equivalent:<br /><pre>float r1 = green(myColor);<br />float r2 =
   * myColor &gt;&gt; 8 &amp; 0xFF;</pre>
   *
   * ( end auto-generated )
   *
   * @webref color:creating_reading
   * @usage web_application
   * @param rgb any value of the color datatype
   * @see PGraphics#red(int)
   * @see PGraphics#blue(int)
   * @see PGraphics#alpha(int)
   * @see PGraphics#hue(int)
   * @see PGraphics#saturation(int)
   * @see PGraphics#brightness(int)
   * @see_external rightshift
   */
  public final float green(int rgb) {
    return g.green(rgb);
  }


  /**
   * ( begin auto-generated from blue.xml )
   *
   * Extracts the blue value from a color, scaled to match current
   * <b>colorMode()</b>. This value is always returned as a  float so be
   * careful not to assign it to an int value.<br /><br />The <b>blue()</b>
   * function is easy to use and undestand, but is slower than another
   * technique. To achieve the same results when working in <b>colorMode(RGB,
   * 255)</b>, but with greater speed, use a bit mask to remove the other
   * color components. For example, the following two lines of code are
   * equivalent:<br /><pre>float r1 = blue(myColor);<br />float r2 = myColor
   * &amp; 0xFF;</pre>
   *
   * ( end auto-generated )
   *
   * @webref color:creating_reading
   * @usage web_application
   * @param rgb any value of the color datatype
   * @see PGraphics#red(int)
   * @see PGraphics#green(int)
   * @see PGraphics#alpha(int)
   * @see PGraphics#hue(int)
   * @see PGraphics#saturation(int)
   * @see PGraphics#brightness(int)
   * @see_external rightshift
   */
  public final float blue(int rgb) {
    return g.blue(rgb);
  }


  /**
   * ( begin auto-generated from hue.xml )
   *
   * Extracts the hue value from a color.
   *
   * ( end auto-generated )
   * @webref color:creating_reading
   * @usage web_application
   * @param rgb any value of the color datatype
   * @see PGraphics#red(int)
   * @see PGraphics#green(int)
   * @see PGraphics#blue(int)
   * @see PGraphics#alpha(int)
   * @see PGraphics#saturation(int)
   * @see PGraphics#brightness(int)
   */
  public final float hue(int rgb) {
    return g.hue(rgb);
  }


  /**
   * ( begin auto-generated from saturation.xml )
   *
   * Extracts the saturation value from a color.
   *
   * ( end auto-generated )
   * @webref color:creating_reading
   * @usage web_application
   * @param rgb any value of the color datatype
   * @see PGraphics#red(int)
   * @see PGraphics#green(int)
   * @see PGraphics#blue(int)
   * @see PGraphics#alpha(int)
   * @see PGraphics#hue(int)
   * @see PGraphics#brightness(int)
   */
  public final float saturation(int rgb) {
    return g.saturation(rgb);
  }


  /**
   * ( begin auto-generated from brightness.xml )
   *
   * Extracts the brightness value from a color.
   *
   * ( end auto-generated )
   *
   * @webref color:creating_reading
   * @usage web_application
   * @param rgb any value of the color datatype
   * @see PGraphics#red(int)
   * @see PGraphics#green(int)
   * @see PGraphics#blue(int)
   * @see PGraphics#alpha(int)
   * @see PGraphics#hue(int)
   * @see PGraphics#saturation(int)
   */
  public final float brightness(int rgb) {
    return g.brightness(rgb);
  }


  /**
   * @nowebref
   * Interpolate between two colors. Like lerp(), but for the
   * individual color components of a color supplied as an int value.
   */
  static public int lerpColor(int c1, int c2, float amt, int mode) {
    return PGraphics.lerpColor(c1, c2, amt, mode);
  }


  /**
   * Display a warning that the specified method is only available with 3D.
   * @param method The method name (no parentheses)
   */
  static public void showDepthWarning(String method) {
    PGraphics.showDepthWarning(method);
  }


  /**
   * Display a warning that the specified method that takes x, y, z parameters
   * can only be used with x and y parameters in this renderer.
   * @param method The method name (no parentheses)
   */
  static public void showDepthWarningXYZ(String method) {
    PGraphics.showDepthWarningXYZ(method);
  }


  /**
   * Display a warning that the specified method is simply unavailable.
   */
  static public void showMethodWarning(String method) {
    PGraphics.showMethodWarning(method);
  }


  /**
   * Error that a particular variation of a method is unavailable (even though
   * other variations are). For instance, if vertex(x, y, u, v) is not
   * available, but vertex(x, y) is just fine.
   */
  static public void showVariationWarning(String str) {
    PGraphics.showVariationWarning(str);
  }


  /**
   * Display a warning that the specified method is not implemented, meaning
   * that it could be either a completely missing function, although other
   * variations of it may still work properly.
   */
  static public void showMissingWarning(String method) {
    PGraphics.showMissingWarning(method);
  }


  /**
   * ( begin auto-generated from PImage_get.xml )
   *
   * Reads the color of any pixel or grabs a section of an image. If no
   * parameters are specified, the entire image is returned. Use the <b>x</b>
   * and <b>y</b> parameters to get the value of one pixel. Get a section of
   * the display window by specifying an additional <b>width</b> and
   * <b>height</b> parameter. When getting an image, the <b>x</b> and
   * <b>y</b> parameters define the coordinates for the upper-left corner of
   * the image, regardless of the current <b>imageMode()</b>.<br />
   * <br />
   * If the pixel requested is outside of the image window, black is
   * returned. The numbers returned are scaled according to the current color
   * ranges, but only RGB values are returned by this function. For example,
   * even though you may have drawn a shape with <b>colorMode(HSB)</b>, the
   * numbers returned will be in RGB format.<br />
   * <br />
   * Getting the color of a single pixel with <b>get(x, y)</b> is easy, but
   * not as fast as grabbing the data directly from <b>pixels[]</b>. The
   * equivalent statement to <b>get(x, y)</b> using <b>pixels[]</b> is
   * <b>pixels[y*width+x]</b>. See the reference for <b>pixels[]</b> for more information.
   *
   * ( end auto-generated )
   *
   * <h3>Advanced</h3>
   * Returns an ARGB "color" type (a packed 32 bit int with the color.
   * If the coordinate is outside the image, zero is returned
   * (black, but completely transparent).
   * <P>
   * If the image is in RGB format (i.e. on a PVideo object),
   * the value will get its high bits set, just to avoid cases where
   * they haven't been set already.
   * <P>
   * If the image is in ALPHA format, this returns a white with its
   * alpha value set.
   * <P>
   * This function is included primarily for beginners. It is quite
   * slow because it has to check to see if the x, y that was provided
   * is inside the bounds, and then has to check to see what image
   * type it is. If you want things to be more efficient, access the
   * pixels[] array directly.
   *
   * @webref image:pixels
   * @brief Reads the color of any pixel or grabs a rectangle of pixels
   * @usage web_application
   * @param x x-coordinate of the pixel
   * @param y y-coordinate of the pixel
   * @see PApplet#set(int, int, int)
   * @see PApplet#pixels
   * @see PApplet#copy(PImage, int, int, int, int, int, int, int, int)
   */
  public int get(int x, int y) {
    return g.get(x, y);
  }


  /**
   * @param w width of pixel rectangle to get
   * @param h height of pixel rectangle to get
   */
  public PImage get(int x, int y, int w, int h) {
    return g.get(x, y, w, h);
  }


  /**
   * Returns a copy of this PImage. Equivalent to get(0, 0, width, height).
   * Deprecated, just use copy() instead.
   */
  public PImage get() {
    return g.get();
  }


  public PImage copy() {
    return g.copy();
  }


  /**
   * ( begin auto-generated from PImage_set.xml )
   *
   * Changes the color of any pixel or writes an image directly into the
   * display window.<br />
   * <br />
   * The <b>x</b> and <b>y</b> parameters specify the pixel to change and the
   * <b>color</b> parameter specifies the color value. The color parameter is
   * affected by the current color mode (the default is RGB values from 0 to
   * 255). When setting an image, the <b>x</b> and <b>y</b> parameters define
   * the coordinates for the upper-left corner of the image, regardless of
   * the current <b>imageMode()</b>.
   * <br /><br />
   * Setting the color of a single pixel with <b>set(x, y)</b> is easy, but
   * not as fast as putting the data directly into <b>pixels[]</b>. The
   * equivalent statement to <b>set(x, y, #000000)</b> using <b>pixels[]</b>
   * is <b>pixels[y*width+x] = #000000</b>. See the reference for
   * <b>pixels[]</b> for more information.
   *
   * ( end auto-generated )
   *
   * @webref image:pixels
   * @brief writes a color to any pixel or writes an image into another
   * @usage web_application
   * @param x x-coordinate of the pixel
   * @param y y-coordinate of the pixel
   * @param c any value of the color datatype
   * @see PImage#get(int, int, int, int)
   * @see PImage#pixels
   * @see PImage#copy(PImage, int, int, int, int, int, int, int, int)
   */
  public void set(int x, int y, int c) {
    g.set(x, y, c);
  }


  /**
   * <h3>Advanced</h3>
   * Efficient method of drawing an image's pixels directly to this surface.
   * No variations are employed, meaning that any scale, tint, or imageMode
   * settings will be ignored.
   *
   * @param img image to copy into the original image
   */
  public void set(int x, int y, PImage img) {
    g.set(x, y, img);
  }


  /**
   * ( begin auto-generated from PImage_mask.xml )
   *
   * Masks part of an image from displaying by loading another image and
   * using it as an alpha channel. This mask image should only contain
   * grayscale data, but only the blue color channel is used. The mask image
   * needs to be the same size as the image to which it is applied.<br />
   * <br />
   * In addition to using a mask image, an integer array containing the alpha
   * channel data can be specified directly. This method is useful for
   * creating dynamically generated alpha masks. This array must be of the
   * same length as the target image's pixels array and should contain only
   * grayscale data of values between 0-255.
   *
   * ( end auto-generated )
   *
   * <h3>Advanced</h3>
   *
   * Set alpha channel for an image. Black colors in the source
   * image will make the destination image completely transparent,
   * and white will make things fully opaque. Gray values will
   * be in-between steps.
   * <P>
   * Strictly speaking the "blue" value from the source image is
   * used as the alpha color. For a fully grayscale image, this
   * is correct, but for a color image it's not 100% accurate.
   * For a more accurate conversion, first use filter(GRAY)
   * which will make the image into a "correct" grayscale by
   * performing a proper luminance-based conversion.
   *
   * @webref pimage:method
   * @usage web_application
   * @param img image to use as the mask
   * @brief Masks part of an image with another image as an alpha channel
   */
  public void mask(PImage img) {
    g.mask(img);
  }


  public void filter(int kind) {
    g.filter(kind);
  }


  /**
   * ( begin auto-generated from PImage_filter.xml )
   *
   * Filters an image as defined by one of the following modes:<br /><br
   * />THRESHOLD - converts the image to black and white pixels depending if
   * they are above or below the threshold defined by the level parameter.
   * The level must be between 0.0 (black) and 1.0(white). If no level is
   * specified, 0.5 is used.<br />
   * <br />
   * GRAY - converts any colors in the image to grayscale equivalents<br />
   * <br />
   * INVERT - sets each pixel to its inverse value<br />
   * <br />
   * POSTERIZE - limits each channel of the image to the number of colors
   * specified as the level parameter<br />
   * <br />
   * BLUR - executes a Guassian blur with the level parameter specifying the
   * extent of the blurring. If no level parameter is used, the blur is
   * equivalent to Guassian blur of radius 1<br />
   * <br />
   * OPAQUE - sets the alpha channel to entirely opaque<br />
   * <br />
   * ERODE - reduces the light areas with the amount defined by the level
   * parameter<br />
   * <br />
   * DILATE - increases the light areas with the amount defined by the level parameter
   *
   * ( end auto-generated )
   *
   * <h3>Advanced</h3>
   * Method to apply a variety of basic filters to this image.
   * <P>
   * <UL>
   * <LI>filter(BLUR) provides a basic blur.
   * <LI>filter(GRAY) converts the image to grayscale based on luminance.
   * <LI>filter(INVERT) will invert the color components in the image.
   * <LI>filter(OPAQUE) set all the high bits in the image to opaque
   * <LI>filter(THRESHOLD) converts the image to black and white.
   * <LI>filter(DILATE) grow white/light areas
   * <LI>filter(ERODE) shrink white/light areas
   * </UL>
   * Luminance conversion code contributed by
   * <A HREF="http://www.toxi.co.uk">toxi</A>
   * <P/>
   * Gaussian blur code contributed by
   * <A HREF="http://incubator.quasimondo.com">Mario Klingemann</A>
   *
   * @webref image:pixels
   * @brief Converts the image to grayscale or black and white
   * @usage web_application
   * @param kind Either THRESHOLD, GRAY, OPAQUE, INVERT, POSTERIZE, BLUR, ERODE, or DILATE
   * @param param unique for each, see above
   */
  public void filter(int kind, float param) {
    g.filter(kind, param);
  }


  /**
   * ( begin auto-generated from PImage_copy.xml )
   *
   * Copies a region of pixels from one image into another. If the source and
   * destination regions aren't the same size, it will automatically resize
   * source pixels to fit the specified target region. No alpha information
   * is used in the process, however if the source image has an alpha channel
   * set, it will be copied as well.
   * <br /><br />
   * As of release 0149, this function ignores <b>imageMode()</b>.
   *
   * ( end auto-generated )
   *
   * @webref image:pixels
   * @brief Copies the entire image
   * @usage web_application
   * @param sx X coordinate of the source's upper left corner
   * @param sy Y coordinate of the source's upper left corner
   * @param sw source image width
   * @param sh source image height
   * @param dx X coordinate of the destination's upper left corner
   * @param dy Y coordinate of the destination's upper left corner
   * @param dw destination image width
   * @param dh destination image height
   * @see PGraphics#alpha(int)
   * @see PImage#blend(PImage, int, int, int, int, int, int, int, int, int)
   */
  public void copy(int sx, int sy, int sw, int sh,
                   int dx, int dy, int dw, int dh) {
    g.copy(sx, sy, sw, sh, dx, dy, dw, dh);
  }


/**
 * @param src an image variable referring to the source image.
 */
  public void copy(PImage src,
                   int sx, int sy, int sw, int sh,
                   int dx, int dy, int dw, int dh) {
    g.copy(src, sx, sy, sw, sh, dx, dy, dw, dh);
  }


  public void blend(int sx, int sy, int sw, int sh,
                    int dx, int dy, int dw, int dh, int mode) {
    g.blend(sx, sy, sw, sh, dx, dy, dw, dh, mode);
  }


  /**
   * ( begin auto-generated from PImage_blend.xml )
   *
   * Blends a region of pixels into the image specified by the <b>img</b>
   * parameter. These copies utilize full alpha channel support and a choice
   * of the following modes to blend the colors of source pixels (A) with the
   * ones of pixels in the destination image (B):<br />
   * <br />
   * BLEND - linear interpolation of colours: C = A*factor + B<br />
   * <br />
   * ADD - additive blending with white clip: C = min(A*factor + B, 255)<br />
   * <br />
   * SUBTRACT - subtractive blending with black clip: C = max(B - A*factor,
   * 0)<br />
   * <br />
   * DARKEST - only the darkest colour succeeds: C = min(A*factor, B)<br />
   * <br />
   * LIGHTEST - only the lightest colour succeeds: C = max(A*factor, B)<br />
   * <br />
   * DIFFERENCE - subtract colors from underlying image.<br />
   * <br />
   * EXCLUSION - similar to DIFFERENCE, but less extreme.<br />
   * <br />
   * MULTIPLY - Multiply the colors, result will always be darker.<br />
   * <br />
   * SCREEN - Opposite multiply, uses inverse values of the colors.<br />
   * <br />
   * OVERLAY - A mix of MULTIPLY and SCREEN. Multiplies dark values,
   * and screens light values.<br />
   * <br />
   * HARD_LIGHT - SCREEN when greater than 50% gray, MULTIPLY when lower.<br />
   * <br />
   * SOFT_LIGHT - Mix of DARKEST and LIGHTEST.
   * Works like OVERLAY, but not as harsh.<br />
   * <br />
   * DODGE - Lightens light tones and increases contrast, ignores darks.
   * Called "Color Dodge" in Illustrator and Photoshop.<br />
   * <br />
   * BURN - Darker areas are applied, increasing contrast, ignores lights.
   * Called "Color Burn" in Illustrator and Photoshop.<br />
   * <br />
   * All modes use the alpha information (highest byte) of source image
   * pixels as the blending factor. If the source and destination regions are
   * different sizes, the image will be automatically resized to match the
   * destination size. If the <b>srcImg</b> parameter is not used, the
   * display window is used as the source image.<br />
   * <br />
   * As of release 0149, this function ignores <b>imageMode()</b>.
   *
   * ( end auto-generated )
   *
   * @webref image:pixels
   * @brief  Copies a pixel or rectangle of pixels using different blending modes
   * @param src an image variable referring to the source image
   * @param sx X coordinate of the source's upper left corner
   * @param sy Y coordinate of the source's upper left corner
   * @param sw source image width
   * @param sh source image height
   * @param dx X coordinate of the destinations's upper left corner
   * @param dy Y coordinate of the destinations's upper left corner
   * @param dw destination image width
   * @param dh destination image height
   * @param mode Either BLEND, ADD, SUBTRACT, LIGHTEST, DARKEST, DIFFERENCE, EXCLUSION, MULTIPLY, SCREEN, OVERLAY, HARD_LIGHT, SOFT_LIGHT, DODGE, BURN
   *
   * @see PApplet#alpha(int)
   * @see PImage#copy(PImage, int, int, int, int, int, int, int, int)
   * @see PImage#blendColor(int,int,int)
   */
  public void blend(PImage src,
                    int sx, int sy, int sw, int sh,
                    int dx, int dy, int dw, int dh, int mode) {
    g.blend(src, sx, sy, sw, sh, dx, dy, dw, dh, mode);
  }

  // CURSOR

  //


  /**
   * Set the cursor type
   * @param kind either ARROW, CROSS, HAND, MOVE, TEXT, or WAIT
   */
  public void cursor(int kind) {
    surface.setCursor(kind);
  }


  /**
   * Replace the cursor with the specified PImage. The x- and y-
   * coordinate of the center will be the center of the image.
   */
  public void cursor(PImage img) {
    cursor(img, img.width/2, img.height/2);
  }


  /**
   * ( begin auto-generated from cursor.xml )
   *
   * Sets the cursor to a predefined symbol, an image, or makes it visible if
   * already hidden. If you are trying to set an image as the cursor, it is
   * recommended to make the size 16x16 or 32x32 pixels. It is not possible
   * to load an image as the cursor if you are exporting your program for the
   * Web and not all MODES work with all Web browsers. The values for
   * parameters <b>x</b> and <b>y</b> must be less than the dimensions of the image.
   * <br /> <br />
   * Setting or hiding the cursor generally does not work with "Present" mode
   * (when running full-screen).
   *
   * ( end auto-generated )
   * <h3>Advanced</h3>
   * Set a custom cursor to an image with a specific hotspot.
   * Only works with JDK 1.2 and later.
   * Currently seems to be broken on Java 1.4 for Mac OS X
   * <p>
   * Based on code contributed by Amit Pitaru, plus additional
   * code to handle Java versions via reflection by Jonathan Feinberg.
   * Reflection removed for release 0128 and later.
   * @webref environment
   * @see PApplet#noCursor()
   * @param img any variable of type PImage
   * @param x the horizontal active spot of the cursor
   * @param y the vertical active spot of the cursor
   */
  public void cursor(PImage img, int x, int y) {
    surface.setCursor(img, x, y);
  }


  /**
   * Show the cursor after noCursor() was called.
   * Notice that the program remembers the last set cursor type
   */
  public void cursor() {
    surface.showCursor();
  }


  /**
   * ( begin auto-generated from noCursor.xml )
   *
   * Hides the cursor from view. Will not work when running the program in a
   * web browser or when running in full screen (Present) mode.
   *
   * ( end auto-generated )
   * <h3>Advanced</h3>
   * Hide the cursor by creating a transparent image
   * and using it as a custom cursor.
   * @webref environment
   * @see PApplet#cursor()
   * @usage Application
   */
  public void noCursor() {
    surface.hideCursor();
  }
	
}
