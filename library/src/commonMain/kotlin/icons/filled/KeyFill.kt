package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.KeyFill: ImageVector
    get() {
        if (_KeyFill != null) {
            return _KeyFill!!
        }
        _KeyFill = ImageVector.Builder(
            name = "Filled.KeyFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216.57f, 39.43f)
                arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 83.91f, 120.78f)
                lineTo(28.69f, 176f)
                arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 187.31f)
                verticalLineTo(216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineTo(72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                verticalLineTo(208f)
                horizontalLineTo(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                verticalLineTo(184f)
                horizontalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.66f, -2.34f)
                lineToRelative(9.56f, -9.57f)
                arcTo(79.73f, 79.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 176f)
                horizontalLineToRelative(0.1f)
                arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216.57f, 39.43f)
                close()
                moveTo(180f, 92f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, -16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 180f, 92f)
                close()
            }
        }.build()

        return _KeyFill!!
    }

@Suppress("ObjectPropertyName")
private var _KeyFill: ImageVector? = null
