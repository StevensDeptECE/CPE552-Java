#!/usr/bin/perl
use strict;

my $res = $ARGV[0];

print "Generating icons resolution: $res\n";

my @svg = <*.svg>;
foreach my $svg (@svg) {
    my $png = $svg;
    $png =~ s/\.svg/$res\.png/g;
    system("inkscape -z -e $png -w $res -h $res $svg");
}
