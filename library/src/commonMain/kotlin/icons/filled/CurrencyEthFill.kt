package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.CurrencyEthFill: ImageVector
    get() {
        if (_CurrencyEthFill != null) {
            return _CurrencyEthFill!!
        }
        _CurrencyEthFill = ImageVector.Builder(
            name = "Filled.CurrencyEthFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(222.29f, 123.06f)
                lineToRelative(-88f, -112f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12.58f, 0f)
                lineToRelative(-88f, 112f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 9.88f)
                lineToRelative(88f, 112f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.58f, 0f)
                lineToRelative(88f, -112f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 222.29f, 123.06f)
                close()
                moveTo(136f, 155.58f)
                lineTo(136f, 39.13f)
                lineToRelative(67.42f, 85.8f)
                close()
                moveTo(120f, 155.58f)
                lineTo(52.58f, 124.93f)
                lineTo(120f, 39.13f)
                close()
                moveTo(120f, 173.15f)
                verticalLineToRelative(43.72f)
                lineToRelative(-53.43f, -68f)
                close()
            }
        }.build()

        return _CurrencyEthFill!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyEthFill: ImageVector? = null
