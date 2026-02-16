package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ShrimpFill: ImageVector
    get() {
        if (_ShrimpFill != null) {
            return _ShrimpFill!!
        }
        _ShrimpFill = ImageVector.Builder(
            name = "Filled.ShrimpFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(136f, 116f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136f, 116f)
                close()
                moveTo(240f, 60f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16.2f, 25.38f)
                arcTo(80.09f, 80.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 160f)
                lineTo(112f, 160f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 24f)
                horizontalLineToRelative(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                lineTo(120f, 200f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                lineTo(96f, 232f)
                arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 72f)
                lineTo(212f, 72f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -24f)
                lineTo(128f, 48f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, -24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineToRelative(84f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 60f)
                close()
                moveTo(85.72f, 182.2f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.16f, -1.86f)
                lineToRelative(-15.36f, 11f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.3f, 13f)
                lineToRelative(15.36f, -11f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 85.72f, 182.2f)
                close()
                moveTo(84.22f, 146.58f)
                lineTo(45.55f, 129f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -6.62f, 14.56f)
                lineTo(77.6f, 161.15f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.59f, -4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 84.22f, 146.58f)
                close()
                moveTo(207.5f, 88f)
                lineTo(120f, 88f)
                verticalLineToRelative(56f)
                horizontalLineToRelative(24f)
                arcTo(64.09f, 64.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 207.5f, 88f)
                close()
            }
        }.build()

        return _ShrimpFill!!
    }

@Suppress("ObjectPropertyName")
private var _ShrimpFill: ImageVector? = null
