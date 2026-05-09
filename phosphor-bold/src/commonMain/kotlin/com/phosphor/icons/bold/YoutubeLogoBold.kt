package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.YoutubeLogoBold: ImageVector
    get() {
        if (_YoutubeLogoBold != null) {
            return _YoutubeLogoBold!!
        }
        _YoutubeLogoBold = ImageVector.Builder(
            name = "Bold.YoutubeLogoBold",
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
                moveTo(164f, 128f)
                lineToRelative(-56f, -36f)
                lineToRelative(0f, 72f)
                lineToRelative(56f, -36f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 128f)
                curveToRelative(0f, 29.91f, 3.07f, 47.45f, 5.41f, 56.47f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 39f, 195.42f)
                curveTo(72.52f, 208.35f, 128f, 208f, 128f, 208f)
                reflectiveCurveToRelative(55.48f, 0.35f, 89f, -12.58f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.63f, -10.95f)
                curveToRelative(2.34f, -9f, 5.41f, -26.56f, 5.41f, -56.47f)
                reflectiveCurveToRelative(-3.07f, -47.45f, -5.41f, -56.47f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.63f, -11f)
                curveTo(183.48f, 47.65f, 128f, 48f, 128f, 48f)
                reflectiveCurveToRelative(-55.48f, -0.35f, -89f, 12.58f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.63f, 11f)
                curveTo(27.07f, 80.54f, 24f, 98.09f, 24f, 128f)
                close()
            }
        }.build()

        return _YoutubeLogoBold!!
    }

@Suppress("ObjectPropertyName")
private var _YoutubeLogoBold: ImageVector? = null
