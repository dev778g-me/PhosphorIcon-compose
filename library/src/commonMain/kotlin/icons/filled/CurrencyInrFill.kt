package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.CurrencyInrFill: ImageVector
    get() {
        if (_CurrencyInrFill != null) {
            return _CurrencyInrFill!!
        }
        _CurrencyInrFill = ImageVector.Builder(
            name = "Filled.CurrencyInrFill",
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
                moveTo(166.32f, 96f)
                lineTo(176f, 96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                horizontalLineToRelative(-8.19f)
                arcTo(44.06f, 44.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 124f, 152f)
                lineTo(111.32f, 152f)
                lineToRelative(53.59f, 41.69f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -9.82f, 12.62f)
                lineToRelative(-72f, -56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 136f)
                horizontalLineToRelative(36f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 27.71f, -24f)
                lineTo(88f, 112f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(61.29f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 124f, 80f)
                lineTo(88f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                lineTo(157.92f, 80f)
                arcTo(43.87f, 43.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 166.32f, 96f)
                close()
            }
        }.build()

        return _CurrencyInrFill!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyInrFill: ImageVector? = null
