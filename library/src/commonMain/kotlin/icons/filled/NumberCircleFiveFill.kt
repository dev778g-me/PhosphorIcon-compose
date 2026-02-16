package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.NumberCircleFiveFill: ImageVector
    get() {
        if (_NumberCircleFiveFill != null) {
            return _NumberCircleFiveFill!!
        }
        _NumberCircleFiveFill = ImageVector.Builder(
            name = "Filled.NumberCircleFiveFill",
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

        return _NumberCircleFiveFill!!
    }

@Suppress("ObjectPropertyName")
private var _NumberCircleFiveFill: ImageVector? = null
