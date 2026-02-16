package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.ShootingStarDuotone: ImageVector
    get() {
        if (_ShootingStarDuotone != null) {
            return _ShootingStarDuotone!!
        }
        _ShootingStarDuotone = ImageVector.Builder(
            name = "Duotone.ShootingStarDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(164f, 129.66f)
                lineToRelative(35.78f, 21.53f)
                arcToRelative(5.46f, 5.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.19f, -5.86f)
                lineToRelative(-9.73f, -40.19f)
                lineToRelative(31.84f, -26.88f)
                arcTo(5.38f, 5.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 227f, 68.78f)
                lineToRelative(-41.79f, -3.31f)
                lineToRelative(-16.1f, -38.14f)
                arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.12f, 0f)
                lineToRelative(-16.1f, 38.14f)
                lineToRelative(-41.79f, 3.31f)
                arcToRelative(5.38f, 5.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.13f, 9.48f)
                lineToRelative(31.84f, 26.88f)
                lineTo(120f, 145.33f)
                arcToRelative(5.46f, 5.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.19f, 5.86f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(164f, 129.66f)
                lineToRelative(35.78f, 21.53f)
                arcToRelative(5.46f, 5.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.19f, -5.86f)
                lineToRelative(-9.73f, -40.19f)
                lineToRelative(31.84f, -26.88f)
                arcTo(5.38f, 5.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 227f, 68.78f)
                lineToRelative(-41.79f, -3.31f)
                lineToRelative(-16.1f, -38.14f)
                arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.12f, 0f)
                lineToRelative(-16.1f, 38.14f)
                lineToRelative(-41.79f, 3.31f)
                arcToRelative(5.38f, 5.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.13f, 9.48f)
                lineToRelative(31.84f, 26.88f)
                lineTo(120f, 145.33f)
                arcToRelative(5.46f, 5.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.19f, 5.86f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(82.45f, 117.55f)
                lineTo(24f, 176f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(93.26f, 178.74f)
                lineTo(40f, 232f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(166.28f, 177.72f)
                lineTo(112f, 232f)
            }
        }.build()

        return _ShootingStarDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ShootingStarDuotone: ImageVector? = null
