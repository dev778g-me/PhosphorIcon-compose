package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.CurrencyEurFill: ImageVector
    get() {
        if (_CurrencyEurFill != null) {
            return _CurrencyEurFill!!
        }
        _CurrencyEurFill = ImageVector.Builder(
            name = "Filled.CurrencyEurFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 24f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                close()
                moveTo(128f, 104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                lineTo(88f, 120f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                lineTo(88.81f, 152f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 65.86f, 21.82f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 10.66f, 11.92f)
                arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72.58f, 152f)
                lineTo(64f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(8f)
                lineTo(72f, 120f)
                lineTo(64f, 120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(8.58f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 92.75f, -33.74f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -10.66f, 11.92f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88.81f, 104f)
                close()
            }
        }.build()

        return _CurrencyEurFill!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyEurFill: ImageVector? = null
