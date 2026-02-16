package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Regular.Plant: ImageVector
    get() {
        if (_Plant != null) {
            return _Plant!!
        }
        _Plant = ImageVector.Builder(
            name = "Regular.Plant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(138.54f, 149.46f)
                curveTo(106.62f, 96.25f, 149.18f, 43.05f, 239.63f, 48.37f)
                curveTo(245f, 138.82f, 191.75f, 181.38f, 138.54f, 149.46f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88.47f, 160.47f)
                curveToRelative(22.8f, -38f, -7.6f, -76f, -72.21f, -72.21f)
                curveTo(12.46f, 152.87f, 50.47f, 183.27f, 88.47f, 160.47f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 128f)
                lineTo(120f, 192f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200f, 88f)
                lineToRelative(-61.25f, 61.25f)
                arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 120f, 194.51f)
                verticalLineTo(224f)
            }
        }.build()

        return _Plant!!
    }

@Suppress("ObjectPropertyName")
private var _Plant: ImageVector? = null
