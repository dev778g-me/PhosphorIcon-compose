package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.GlobeHemisphereEastBold: ImageVector
    get() {
        if (_GlobeHemisphereEastBold != null) {
            return _GlobeHemisphereEastBold!!
        }
        _GlobeHemisphereEastBold = ImageVector.Builder(
            name = "Bold.GlobeHemisphereEastBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 128f)
                moveToRelative(-96f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 192f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, -192f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(184.42f, 205.68f)
                lineToRelative(-9.36f, -9.37f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.63f, -2.09f)
                lineTo(150f, 188.59f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.88f, -8.9f)
                lineToRelative(2.38f, -16.2f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.85f, -6.22f)
                lineToRelative(30.45f, -12.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.47f, 1.49f)
                lineTo(215f, 168.71f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(50.49f, 184.65f)
                lineToRelative(9.92f, -6.52f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 171.49f)
                lineToRelative(0.21f, -36.23f)
                arcToRelative(8.06f, 8.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.35f, -4.41f)
                lineToRelative(20.94f, -31.3f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.34f, -2f)
                lineToRelative(19.81f, 13f)
                arcToRelative(8.06f, 8.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.77f, 1.45f)
                lineToRelative(31.46f, -4.26f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -2.71f)
                lineTo(182.06f, 79.2f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 184f, 74f)
                verticalLineTo(50f)
            }
        }.build()

        return _GlobeHemisphereEastBold!!
    }

@Suppress("ObjectPropertyName")
private var _GlobeHemisphereEastBold: ImageVector? = null
