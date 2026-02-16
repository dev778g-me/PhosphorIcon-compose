package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ArrowLineDownRightFill: ImageVector
    get() {
        if (_ArrowLineDownRightFill != null) {
            return _ArrowLineDownRightFill!!
        }
        _ArrowLineDownRightFill = ImageVector.Builder(
            name = "Filled.ArrowLineDownRightFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(224f, 40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineTo(216f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 40f)
                close()
                moveTo(195.06f, 96.61f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.72f, 1.73f)
                lineTo(144f, 140.69f)
                lineTo(85.66f, 82.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 74.34f, 93.66f)
                lineTo(132.69f, 152f)
                lineTo(90.34f, 194.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 208f)
                horizontalLineToRelative(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                verticalLineTo(104f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 195.06f, 96.61f)
                close()
            }
        }.build()

        return _ArrowLineDownRightFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLineDownRightFill: ImageVector? = null
