package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.CurrencyGbpFill: ImageVector
    get() {
        if (_CurrencyGbpFill != null) {
            return _CurrencyGbpFill!!
        }
        _CurrencyGbpFill = ImageVector.Builder(
            name = "Filled.CurrencyGbpFill",
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
                moveTo(168f, 184f)
                lineTo(88f, 184f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(104f, 136f)
                lineTo(88f, 136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(16f)
                lineTo(104f, 96f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 60f, -34.64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 13.85f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 120f, 96f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                lineTo(120f, 136f)
                verticalLineToRelative(16f)
                arcToRelative(31.71f, 31.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.31f, 16f)
                lineTo(168f, 168f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
            }
        }.build()

        return _CurrencyGbpFill!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyGbpFill: ImageVector? = null
