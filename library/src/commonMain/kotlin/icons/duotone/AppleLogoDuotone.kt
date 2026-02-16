package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.AppleLogoDuotone: ImageVector
    get() {
        if (_AppleLogoDuotone != null) {
            return _AppleLogoDuotone!!
        }
        _AppleLogoDuotone = ImageVector.Builder(
            name = "Duotone.AppleLogoDuotone",
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
                moveTo(216f, 73.52f)
                curveTo(204.53f, 62.66f, 185f, 56f, 168f, 56f)
                arcToRelative(63.72f, 63.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, -40f, 14f)
                horizontalLineToRelative(0f)
                arcTo(63.71f, 63.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88.88f, 56f)
                curveTo(52f, 55.5f, 23.06f, 86.3f, 24f, 123.19f)
                arcToRelative(119.62f, 119.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 37.65f, 84.12f)
                arcTo(31.92f, 31.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 83.6f, 216f)
                horizontalLineToRelative(87.7f)
                arcToRelative(31.75f, 31.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.26f, -10f)
                curveToRelative(15.85f, -17f, 21.44f, -33.2f, 21.44f, -33.2f)
                horizontalLineToRelative(0f)
                curveToRelative(-16.79f, -11.53f, -24f, -30.87f, -24f, -52.78f)
                curveToRelative(0f, -18.3f, 11.68f, -34.81f, 24f, -46.48f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(216f, 73.52f)
                curveTo(204.53f, 62.66f, 185f, 56f, 168f, 56f)
                arcToRelative(63.72f, 63.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, -40f, 14f)
                horizontalLineToRelative(0f)
                arcTo(63.71f, 63.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88.88f, 56f)
                curveTo(52f, 55.5f, 23.06f, 86.3f, 24f, 123.19f)
                arcToRelative(119.62f, 119.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 37.65f, 84.12f)
                arcTo(31.92f, 31.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 83.6f, 216f)
                horizontalLineToRelative(87.7f)
                arcToRelative(31.75f, 31.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.26f, -10f)
                curveToRelative(15.85f, -17f, 21.44f, -33.2f, 21.44f, -33.2f)
                horizontalLineToRelative(0f)
                curveToRelative(-16.79f, -11.53f, -24f, -30.87f, -24f, -52.78f)
                curveToRelative(0f, -18.3f, 11.68f, -34.81f, 24f, -46.48f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 8f)
                horizontalLineToRelative(-1f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -31f, 24f)
            }
        }.build()

        return _AppleLogoDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _AppleLogoDuotone: ImageVector? = null
