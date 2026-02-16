package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PaintBrushFill: ImageVector
    get() {
        if (_PaintBrushFill != null) {
            return _PaintBrushFill!!
        }
        _PaintBrushFill = ImageVector.Builder(
            name = "Filled.PaintBrushFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                curveToRelative(-44.08f, 0f, -89.31f, 49.71f, -114.43f, 82.63f)
                arcTo(60f, 60f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 164f)
                curveToRelative(0f, 30.88f, -19.54f, 44.73f, -20.47f, 45.37f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 224f)
                lineTo(92f, 224f)
                arcToRelative(60f, 60f, 0f, isMoreThanHalf = false, isPositiveArc = false, 57.37f, -77.57f)
                curveTo(182.3f, 121.31f, 232f, 76.08f, 232f, 32f)
                close()
                moveTo(124.42f, 113.55f)
                quadToRelative(5.14f, -6.66f, 10.09f, -12.55f)
                arcTo(76.23f, 76.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 155f, 121.49f)
                quadToRelative(-5.9f, 4.94f, -12.55f, 10.09f)
                arcTo(60.54f, 60.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 124.42f, 113.55f)
                close()
                moveTo(167.12f, 110.87f)
                arcToRelative(92.57f, 92.57f, 0f, isMoreThanHalf = false, isPositiveArc = false, -22f, -22f)
                curveToRelative(31.78f, -34.53f, 55.75f, -45f, 69.9f, -47.91f)
                curveTo(212.17f, 55.12f, 201.65f, 79.09f, 167.12f, 110.87f)
                close()
            }
        }.build()

        return _PaintBrushFill!!
    }

@Suppress("ObjectPropertyName")
private var _PaintBrushFill: ImageVector? = null
