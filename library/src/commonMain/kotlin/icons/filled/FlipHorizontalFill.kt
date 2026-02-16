package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.FlipHorizontalFill: ImageVector
    get() {
        if (_FlipHorizontalFill != null) {
            return _FlipHorizontalFill!!
        }
        _FlipHorizontalFill = ImageVector.Builder(
            name = "Filled.FlipHorizontalFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(120f, 40f)
                verticalLineTo(200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                horizontalLineTo(40f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -14.78f, -22.15f)
                lineToRelative(64f, -159.93f)
                lineToRelative(0.06f, -0.14f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 120f, 40f)
                close()
                moveTo(229.33f, 208.84f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 216f)
                horizontalLineTo(152f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                verticalLineTo(40f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 30.74f, -6.23f)
                lineToRelative(0.06f, 0.14f)
                lineToRelative(64f, 159.93f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 229.33f, 208.84f)
                close()
                moveTo(216f, 200f)
                lineToRelative(-0.06f, -0.15f)
                lineTo(152f, 40f)
                verticalLineTo(200f)
                close()
            }
        }.build()

        return _FlipHorizontalFill!!
    }

@Suppress("ObjectPropertyName")
private var _FlipHorizontalFill: ImageVector? = null
