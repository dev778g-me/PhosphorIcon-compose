package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.SunglassesFill: ImageVector
    get() {
        if (_SunglassesFill != null) {
            return _SunglassesFill!!
        }
        _SunglassesFill = ImageVector.Builder(
            name = "Filled.SunglassesFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(200f, 40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
                verticalLineToRelative(56f)
                lineTo(40f, 128f)
                lineTo(40f, 72f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 72f)
                verticalLineToRelative(92f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 0f)
                lineTo(112f, 144f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(20f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 0f)
                lineTo(232f, 72f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 40f)
                close()
                moveTo(91.22f, 179.22f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.31f, 0f)
                lineTo(58.34f, 157.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, -11.32f)
                lineToRelative(21.56f, 21.57f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 91.22f, 179.22f)
                close()
                moveTo(211.22f, 179.22f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.31f, 0f)
                lineToRelative(-21.57f, -21.56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, -11.32f)
                lineToRelative(21.56f, 21.57f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 211.22f, 179.22f)
                close()
            }
        }.build()

        return _SunglassesFill!!
    }

@Suppress("ObjectPropertyName")
private var _SunglassesFill: ImageVector? = null
