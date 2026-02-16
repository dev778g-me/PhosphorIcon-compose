package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.PlantBold: ImageVector
    get() {
        if (_PlantBold != null) {
            return _PlantBold!!
        }
        _PlantBold = ImageVector.Builder(
            name = "Bold.PlantBold",
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
                moveTo(142.54f, 153.46f)
                curveTo(110.62f, 100.25f, 153.18f, 47.05f, 243.63f, 52.37f)
                curveTo(249f, 142.82f, 195.75f, 185.38f, 142.54f, 153.46f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88.47f, 164.47f)
                curveToRelative(22.8f, -38f, -7.6f, -76f, -72.21f, -72.21f)
                curveTo(12.46f, 156.87f, 50.47f, 187.27f, 88.47f, 164.47f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(64f, 140f)
                lineTo(124f, 200f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(192f, 104f)
                lineToRelative(-49.25f, 49.25f)
                arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 124f, 198.51f)
                verticalLineTo(228f)
            }
        }.build()

        return _PlantBold!!
    }

@Suppress("ObjectPropertyName")
private var _PlantBold: ImageVector? = null
