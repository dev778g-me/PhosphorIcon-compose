package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.UserRectangleFill: ImageVector
    get() {
        if (_UserRectangleFill != null) {
            return _UserRectangleFill!!
        }
        _UserRectangleFill = ImageVector.Builder(
            name = "Filled.UserRectangleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(172f, 120f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = true, -44f, -44f)
                arcTo(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 172f, 120f)
                close()
                moveTo(232f, 56f)
                lineTo(232f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(40f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(24f, 56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 40f)
                lineTo(216f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 56f)
                close()
                moveTo(216f, 200f)
                lineTo(216f, 56f)
                lineTo(40f, 56f)
                lineTo(40f, 200f)
                lineTo(54.68f, 200f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 29.41f, -34.84f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.83f, 0.31f)
                arcToRelative(59.82f, 59.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 78.16f, 0f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.83f, -0.31f)
                arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 201.32f, 200f)
                lineTo(216f, 200f)
                close()
            }
        }.build()

        return _UserRectangleFill!!
    }

@Suppress("ObjectPropertyName")
private var _UserRectangleFill: ImageVector? = null
