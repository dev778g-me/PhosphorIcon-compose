package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ToothFill: ImageVector
    get() {
        if (_ToothFill != null) {
            return _ToothFill!!
        }
        _ToothFill = ImageVector.Builder(
            name = "Filled.ToothFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(168f, 24f)
                lineTo(88f, 24f)
                arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 79.75f)
                curveToRelative(0f, 42.72f, 8f, 75.4f, 14.7f, 95.28f)
                curveToRelative(8.72f, 25.8f, 20.62f, 45.49f, 32.64f, 54f)
                arcTo(15.67f, 15.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88.47f, 232f)
                arcToRelative(16.09f, 16.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -14.9f)
                curveToRelative(0.85f, -11.52f, 5f, -49.11f, 23.53f, -49.11f)
                reflectiveCurveToRelative(22.68f, 37.59f, 23.53f, 49.11f)
                arcToRelative(16.09f, 16.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.18f, 13.36f)
                arcToRelative(15.69f, 15.69f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.95f, -1.41f)
                curveToRelative(12f, -8.53f, 23.92f, -28.22f, 32.64f, -54f)
                curveTo(216f, 155.15f, 224f, 122.47f, 224f, 79.75f)
                arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 168f, 24f)
                close()
                moveTo(171f, 80.57f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 165f, 95.42f)
                lineTo(128f, 80.61f)
                lineTo(91f, 95.42f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 85f, 80.57f)
                lineTo(106.46f, 72f)
                lineTo(85f, 63.42f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 91f, 48.57f)
                lineToRelative(37f, 14.81f)
                lineToRelative(37f, -14.81f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 171f, 63.42f)
                lineTo(149.54f, 72f)
                close()
            }
        }.build()

        return _ToothFill!!
    }

@Suppress("ObjectPropertyName")
private var _ToothFill: ImageVector? = null
