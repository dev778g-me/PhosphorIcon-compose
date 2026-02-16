package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.PizzaDuotone: ImageVector
    get() {
        if (_PizzaDuotone != null) {
            return _PizzaDuotone!!
        }
        _PizzaDuotone = ImageVector.Builder(
            name = "Duotone.PizzaDuotone",
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
                moveTo(136f, 168f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 51.2f, -25.6f)
                lineToRelative(30.9f, -50.64f)
                arcToRelative(160.1f, 160.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -180.2f, 0f)
                lineToRelative(15.84f, 26f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 30.51f, 50f)
                lineToRelative(36.9f, 60.45f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.7f, 0f)
                lineTo(154f, 196.78f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136f, 168f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(25.16f, 70.9f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.7f, -11f)
                arcToRelative(193.49f, 193.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200.28f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.7f, 11f)
                lineToRelative(-96f, 157.26f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.7f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(37.9f, 91.76f)
                arcToRelative(160.1f, 160.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 180.2f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(154f, 196.79f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 33.2f, -54.39f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(53.74f, 117.71f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 30.65f, 50f)
            }
        }.build()

        return _PizzaDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _PizzaDuotone: ImageVector? = null
