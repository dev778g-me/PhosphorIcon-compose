package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.TargetFill: ImageVector
    get() {
        if (_TargetFill != null) {
            return _TargetFill!!
        }
        _TargetFill = ImageVector.Builder(
            name = "Filled.TargetFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(211.2f, 79.39f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.77f, 10.67f)
                arcTo(88.09f, 88.09f, 0f, isMoreThanHalf = true, isPositiveArc = true, 184.3f, 60.39f)
                lineTo(161.53f, 83.16f)
                arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88.4f, 167.59f)
                horizontalLineToRelative(0f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 95.5f, -42.79f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -16f, 0.9f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, -62f, 35.67f)
                lineToRelative(23.95f, -23.95f)
                lineTo(167.6f, 99.72f)
                horizontalLineToRelative(0f)
                lineToRelative(62.06f, -62f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, -11.32f)
                lineTo(195.67f, 49f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = false, 54.46f, 201.54f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = false, 221.87f, 83.16f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 211.2f, 79.39f)
                close()
            }
        }.build()

        return _TargetFill!!
    }

@Suppress("ObjectPropertyName")
private var _TargetFill: ImageVector? = null
