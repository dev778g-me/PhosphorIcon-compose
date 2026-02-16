package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.SuitcaseSimpleFill: ImageVector
    get() {
        if (_SuitcaseSimpleFill != null) {
            return _SuitcaseSimpleFill!!
        }
        _SuitcaseSimpleFill = ImageVector.Builder(
            name = "Filled.SuitcaseSimpleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 56f)
                horizontalLineTo(176f)
                verticalLineTo(48f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -24f, -24f)
                horizontalLineTo(104f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 48f)
                verticalLineToRelative(8f)
                horizontalLineTo(40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 72f)
                verticalLineTo(200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineTo(216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineTo(72f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 56f)
                close()
                moveTo(96f, 48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                verticalLineToRelative(8f)
                horizontalLineTo(96f)
                close()
                moveTo(216f, 72f)
                verticalLineToRelative(72f)
                horizontalLineTo(40f)
                verticalLineTo(72f)
                close()
            }
        }.build()

        return _SuitcaseSimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _SuitcaseSimpleFill: ImageVector? = null
