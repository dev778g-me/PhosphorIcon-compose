package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.NumberSquareFiveFill: ImageVector
    get() {
        if (_NumberSquareFiveFill != null) {
            return _NumberSquareFiveFill!!
        }
        _NumberSquareFiveFill = ImageVector.Builder(
            name = "Filled.NumberSquareFiveFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 32f)
                lineTo(48f, 32f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 48f)
                lineTo(32f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(208f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(224f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 32f)
                close()
                moveTo(124f, 112f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 72f)
                arcToRelative(35.54f, 35.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, -25.71f, -10.4f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 11.42f, -11.2f)
                arcTo(19.73f, 19.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, 124f, 168f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -40f)
                arcToRelative(19.73f, 19.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.29f, 5.6f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.6f, -6.92f)
                lineToRelative(8f, -48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 72f)
                horizontalLineToRelative(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                lineTo(118.78f, 88f)
                lineToRelative(-4.19f, 25.14f)
                arcTo(38.8f, 38.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 124f, 112f)
                close()
            }
        }.build()

        return _NumberSquareFiveFill!!
    }

@Suppress("ObjectPropertyName")
private var _NumberSquareFiveFill: ImageVector? = null
