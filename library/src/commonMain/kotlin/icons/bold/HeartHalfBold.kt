package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.HeartHalfBold: ImageVector
    get() {
        if (_HeartHalfBold != null) {
            return _HeartHalfBold!!
        }
        _HeartHalfBold = ImageVector.Builder(
            name = "Bold.HeartHalfBold",
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
                moveTo(128f, 224f)
                reflectiveCurveTo(24f, 168f, 24f, 102f)
                arcTo(54f, 54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 78f, 48f)
                curveToRelative(22.59f, 0f, 41.94f, 12.31f, 50f, 32f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 80f)
                curveToRelative(6.84f, -16.71f, 21.81f, -27.67f, 40f, -31.08f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 57.09f)
                arcTo(54f, 54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 231.67f, 96f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(223.3f, 136f)
                curveToRelative(-5.8f, 11.65f, -14.05f, 22.63f, -23.3f, 32.63f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 197.49f)
                arcTo(328.1f, 328.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 224f)
            }
        }.build()

        return _HeartHalfBold!!
    }

@Suppress("ObjectPropertyName")
private var _HeartHalfBold: ImageVector? = null
