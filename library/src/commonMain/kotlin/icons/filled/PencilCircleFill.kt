package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PencilCircleFill: ImageVector
    get() {
        if (_PencilCircleFill != null) {
            return _PencilCircleFill!!
        }
        _PencilCircleFill = ImageVector.Builder(
            name = "Filled.PencilCircleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(201.54f, 54.46f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = false, 54.46f, 201.54f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = false, 201.54f, 54.46f)
                close()
                moveTo(128f, 170.87f)
                arcToRelative(31.93f, 31.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -32.31f, -9.77f)
                lineTo(111f, 128f)
                lineTo(145f, 128f)
                lineToRelative(15.27f, 33.1f)
                arcTo(31.93f, 31.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 170.87f)
                close()
                moveTo(168f, 206.37f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 9.22f)
                lineTo(136f, 192f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 0f)
                close()
                moveTo(190.22f, 190.23f)
                curveToRelative(-2f, 2f, -4.08f, 3.87f, -6.22f, 5.64f)
                lineTo(184f, 176f)
                arcToRelative(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.74f, -3.35f)
                lineToRelative(-48f, -104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.52f, 0f)
                lineToRelative(-48f, 104f)
                arcTo(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 176f)
                verticalLineToRelative(19.87f)
                curveToRelative(-2.14f, -1.77f, -4.22f, -3.64f, -6.22f, -5.64f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = true, 124.44f, 0f)
                close()
            }
        }.build()

        return _PencilCircleFill!!
    }

@Suppress("ObjectPropertyName")
private var _PencilCircleFill: ImageVector? = null
