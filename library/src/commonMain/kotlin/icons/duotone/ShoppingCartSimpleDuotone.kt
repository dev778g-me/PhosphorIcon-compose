package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.ShoppingCartSimpleDuotone: ImageVector
    get() {
        if (_ShoppingCartSimpleDuotone != null) {
            return _ShoppingCartSimpleDuotone!!
        }
        _ShoppingCartSimpleDuotone = ImageVector.Builder(
            name = "Duotone.ShoppingCartSimpleDuotone",
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
                moveTo(76.75f, 164.28f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 92.16f, 176f)
                horizontalLineTo(191f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.42f, -11.72f)
                lineTo(232f, 72f)
                horizontalLineTo(51.11f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(88f, 216f)
                moveToRelative(-16f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(192f, 216f)
                moveToRelative(-16f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 32f)
                horizontalLineTo(40f)
                lineTo(76.75f, 164.28f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 92.16f, 176f)
                horizontalLineTo(191f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.42f, -11.72f)
                lineTo(232f, 72f)
                horizontalLineTo(51.11f)
            }
        }.build()

        return _ShoppingCartSimpleDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ShoppingCartSimpleDuotone: ImageVector? = null
