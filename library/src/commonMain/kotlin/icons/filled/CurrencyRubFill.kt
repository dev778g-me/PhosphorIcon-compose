package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.CurrencyRubFill: ImageVector
    get() {
        if (_CurrencyRubFill != null) {
            return _CurrencyRubFill!!
        }
        _CurrencyRubFill = ImageVector.Builder(
            name = "Filled.CurrencyRubFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(168f, 104f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, 24f)
                lineTo(112f, 128f)
                lineTo(112f, 80f)
                horizontalLineToRelative(32f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 104f)
                close()
                moveTo(232f, 128f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = true, 128f, 24f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 128f)
                close()
                moveTo(184f, 104f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, -40f, -40f)
                lineTo(104f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(56f)
                lineTo(88f, 128f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(16f)
                lineTo(88f, 160f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(112f, 176f)
                horizontalLineToRelative(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(112f, 160f)
                lineTo(112f, 144f)
                horizontalLineToRelative(32f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 184f, 104f)
                close()
            }
        }.build()

        return _CurrencyRubFill!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyRubFill: ImageVector? = null
