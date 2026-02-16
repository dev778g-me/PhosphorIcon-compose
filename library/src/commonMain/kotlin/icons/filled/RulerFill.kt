package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.RulerFill: ImageVector
    get() {
        if (_RulerFill != null) {
            return _RulerFill!!
        }
        _RulerFill = ImageVector.Builder(
            name = "Filled.RulerFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(235.32f, 96f)
                lineTo(96f, 235.31f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -22.63f, 0f)
                lineTo(20.68f, 182.63f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -22.63f)
                lineToRelative(29.17f, -29.17f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.66f, 0f)
                lineToRelative(34.83f, 34.83f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.71f, -0.43f)
                arcToRelative(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.6f, -11.09f)
                lineTo(66.82f, 119.51f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -5.65f)
                lineToRelative(15f, -15f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.66f, 0f)
                lineToRelative(34.83f, 34.83f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.71f, -0.43f)
                arcToRelative(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.6f, -11.09f)
                lineTo(98.83f, 87.51f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -5.65f)
                lineToRelative(15f, -15f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.65f, 0f)
                lineToRelative(34.83f, 34.83f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.72f, -0.43f)
                arcToRelative(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.61f, -11.09f)
                lineTo(130.83f, 55.51f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -5.65f)
                lineTo(160f, 20.69f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.63f, 0f)
                lineToRelative(52.69f, 52.68f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 235.32f, 96f)
                close()
            }
        }.build()

        return _RulerFill!!
    }

@Suppress("ObjectPropertyName")
private var _RulerFill: ImageVector? = null
