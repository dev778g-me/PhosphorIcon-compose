package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.FaceMaskFill: ImageVector
    get() {
        if (_FaceMaskFill != null) {
            return _FaceMaskFill!!
        }
        _FaceMaskFill = ImageVector.Builder(
            name = "Filled.FaceMaskFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(224f, 72f)
                horizontalLineToRelative(-0.85f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.68f, -10f)
                lineTo(133.47f, 33f)
                arcToRelative(16.06f, 16.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.94f, 0f)
                lineToRelative(-80f, 29.09f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.68f, 10f)
                lineTo(32f, 72.09f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 104f)
                verticalLineToRelative(24f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 32f)
                horizontalLineToRelative(5.19f)
                curveToRelative(7.19f, 15.8f, 21.79f, 29.43f, 43.23f, 40.16f)
                arcToRelative(191.16f, 191.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 46.15f, 15.71f)
                arcToRelative(7.93f, 7.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.86f, 0f)
                arcToRelative(191.16f, 191.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 46.15f, -15.71f)
                curveToRelative(21.44f, -10.73f, 36f, -24.36f, 43.23f, -40.16f)
                lineTo(224f, 160f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, -32f)
                lineTo(256f, 104f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 72f)
                close()
                moveTo(32f, 144f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(16f, 104f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 88f)
                verticalLineToRelative(48f)
                arcToRelative(58.74f, 58.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.55f, 8f)
                close()
                moveTo(168f, 144f)
                lineTo(88f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
                moveTo(168f, 112f)
                lineTo(88f, 112f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
                moveTo(240f, 128f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                horizontalLineToRelative(-0.55f)
                arcToRelative(58.74f, 58.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.55f, -8f)
                lineTo(224f, 88f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
                close()
            }
        }.build()

        return _FaceMaskFill!!
    }

@Suppress("ObjectPropertyName")
private var _FaceMaskFill: ImageVector? = null
