package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.TrolleySuitcaseFill: ImageVector
    get() {
        if (_TrolleySuitcaseFill != null) {
            return _TrolleySuitcaseFill!!
        }
        _TrolleySuitcaseFill = ImageVector.Builder(
            name = "Filled.TrolleySuitcaseFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(88f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, -16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 224f)
                close()
                moveTo(216f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = false, 16f, 16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 208f)
                close()
                moveTo(240f, 176f)
                lineTo(56f, 176f)
                lineTo(56f, 75.31f)
                arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 51.31f, 64f)
                lineTo(29.66f, 42.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.34f, 53.66f)
                lineTo(40f, 75.31f)
                lineTo(40f, 176f)
                lineTo(32f, 176f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                lineTo(240f, 192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
                moveTo(72f, 144f)
                lineTo(72f, 72f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 56f)
                horizontalLineToRelative(32f)
                lineTo(120f, 40f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, -16f)
                horizontalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
                lineTo(184f, 56f)
                horizontalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
                verticalLineToRelative(72f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(88f, 160f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 144f)
                close()
                moveTo(136f, 56f)
                horizontalLineToRelative(32f)
                lineTo(168f, 40f)
                lineTo(136f, 40f)
                close()
            }
        }.build()

        return _TrolleySuitcaseFill!!
    }

@Suppress("ObjectPropertyName")
private var _TrolleySuitcaseFill: ImageVector? = null
