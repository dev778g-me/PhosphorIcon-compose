package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PinwheelFill: ImageVector
    get() {
        if (_PinwheelFill != null) {
            return _PinwheelFill!!
        }
        _PinwheelFill = ImageVector.Builder(
            name = "Filled.PinwheelFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(229.66f, 218.34f)
                lineToRelative(-48.42f, -48.41f)
                curveToRelative(1.1f, -0.33f, 2.19f, -0.68f, 3.27f, -1.07f)
                arcTo(60f, 60f, 0f, isMoreThanHalf = false, isPositiveArc = false, 220.37f, 92f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.25f, -4.78f)
                lineToRelative(-44.2f, 16.08f)
                curveToRelative(0.32f, -0.62f, 0.64f, -1.24f, 0.93f, -1.88f)
                arcTo(60f, 60f, 0f, isMoreThanHalf = false, isPositiveArc = false, 92f, 19.65f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 87.18f, 29.9f)
                lineToRelative(16.09f, 44.22f)
                curveToRelative(-0.63f, -0.32f, -1.25f, -0.65f, -1.89f, -1f)
                arcToRelative(60f, 60f, 0f, isMoreThanHalf = false, isPositiveArc = false, -81.73f, 74.89f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.25f, 4.78f)
                lineToRelative(44.2f, -16.09f)
                curveToRelative(-0.32f, 0.63f, -0.64f, 1.25f, -0.93f, 1.89f)
                arcToRelative(60f, 60f, 0f, isMoreThanHalf = false, isPositiveArc = false, 74.89f, 81.73f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.78f, -10.25f)
                lineToRelative(-16.08f, -44.18f)
                curveToRelative(0.62f, 0.31f, 1.24f, 0.62f, 1.88f, 0.91f)
                arcToRelative(59.87f, 59.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.48f, 5.58f)
                lineToRelative(57.22f, 57.23f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, -11.32f)
                close()
                moveTo(109f, 203.87f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.73f, -77.81f)
                lineToRelative(29.6f, 81.33f)
                arcTo(43.6f, 43.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 109f, 203.87f)
                close()
                moveTo(152.4f, 94.62f)
                arcTo(43.77f, 43.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 134.8f, 114f)
                lineTo(105.19f, 32.63f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 47.16f, 62f)
                close()
            }
        }.build()

        return _PinwheelFill!!
    }

@Suppress("ObjectPropertyName")
private var _PinwheelFill: ImageVector? = null
