package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.BracketsAngleFill: ImageVector
    get() {
        if (_BracketsAngleFill != null) {
            return _BracketsAngleFill!!
        }
        _BracketsAngleFill = ImageVector.Builder(
            name = "Filled.BracketsAngleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 40f)
                horizontalLineTo(40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 56f)
                verticalLineTo(200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineTo(216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineTo(56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 40f)
                close()
                moveTo(103f, 180f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 89.05f, 188f)
                lineToRelative(-32f, -56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -7.94f)
                lineToRelative(32f, -56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 103f, 76f)
                lineTo(73.21f, 128f)
                close()
                moveTo(199f, 132f)
                lineToRelative(-32f, 56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.9f, -7.94f)
                lineToRelative(29.74f, -52f)
                lineTo(153.05f, 76f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 167f, 68f)
                lineToRelative(32f, 56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 199f, 132f)
                close()
            }
        }.build()

        return _BracketsAngleFill!!
    }

@Suppress("ObjectPropertyName")
private var _BracketsAngleFill: ImageVector? = null
