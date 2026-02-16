package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.CurrencyNgnFill: ImageVector
    get() {
        if (_CurrencyNgnFill != null) {
            return _CurrencyNgnFill!!
        }
        _CurrencyNgnFill = ImageVector.Builder(
            name = "Filled.CurrencyNgnFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(143.55f, 136f)
                lineTo(160f, 136f)
                verticalLineToRelative(23f)
                close()
                moveTo(96f, 120f)
                horizontalLineToRelative(16.45f)
                lineTo(96f, 97f)
                close()
                moveTo(232f, 128f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = true, 128f, 24f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 128f)
                close()
                moveTo(200f, 128f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                lineTo(176f, 120f)
                lineTo(176f, 72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(48f)
                lineTo(132.12f, 120f)
                lineTo(94.51f, 67.35f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 72f)
                verticalLineToRelative(48f)
                lineTo(64f, 120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                lineTo(80f, 136f)
                verticalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(96f, 136f)
                horizontalLineToRelative(27.88f)
                lineToRelative(37.61f, 52.65f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 168f, 192f)
                arcToRelative(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.44f, -0.38f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 184f)
                lineTo(176f, 136f)
                horizontalLineToRelative(16f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 128f)
                close()
            }
        }.build()

        return _CurrencyNgnFill!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyNgnFill: ImageVector? = null
