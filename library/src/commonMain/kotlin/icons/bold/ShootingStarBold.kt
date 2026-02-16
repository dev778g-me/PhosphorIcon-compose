package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.ShootingStarBold: ImageVector
    get() {
        if (_ShootingStarBold != null) {
            return _ShootingStarBold!!
        }
        _ShootingStarBold = ImageVector.Builder(
            name = "Bold.ShootingStarBold",
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
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(75.75f, 124.25f)
                lineTo(24f, 176f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(87.6f, 184.4f)
                lineTo(40f, 232f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(150.04f, 193.96f)
                lineTo(112f, 232f)
            }
        }.build()

        return _ShootingStarBold!!
    }

@Suppress("ObjectPropertyName")
private var _ShootingStarBold: ImageVector? = null
