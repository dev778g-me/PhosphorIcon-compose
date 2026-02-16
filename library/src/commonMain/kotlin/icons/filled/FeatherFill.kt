package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.FeatherFill: ImageVector
    get() {
        if (_FeatherFill != null) {
            return _FeatherFill!!
        }
        _FeatherFill = ImageVector.Builder(
            name = "Filled.FeatherFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(211.84f, 134.81f)
                lineToRelative(-59.79f, 60.47f)
                lineToRelative(0f, 0f)
                arcToRelative(15.75f, 15.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.2f, 4.68f)
                horizontalLineTo(75.32f)
                lineTo(45.66f, 229.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, -11.32f)
                lineToRelative(22.59f, -22.58f)
                horizontalLineToRelative(0f)
                lineTo(124.7f, 128f)
                horizontalLineTo(209f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 211.84f, 134.81f)
                close()
                moveTo(216.7f, 30.57f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, -85.9f, 4.14f)
                lineToRelative(-9.6f, 9.48f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 120f, 47f)
                verticalLineToRelative(63f)
                lineToRelative(55f, -55f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.31f, 11.31f)
                lineTo(140.71f, 112f)
                horizontalLineToRelative(88.38f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.56f, -2.16f)
                arcTo(64.08f, 64.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216.7f, 30.57f)
                close()
                moveTo(62.83f, 167.23f)
                lineTo(104f, 126.06f)
                verticalLineTo(70.76f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.81f, -2.84f)
                lineTo(60.69f, 104f)
                arcTo(15.9f, 15.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 115.31f)
                verticalLineTo(164.4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 62.83f, 167.23f)
                close()
            }
        }.build()

        return _FeatherFill!!
    }

@Suppress("ObjectPropertyName")
private var _FeatherFill: ImageVector? = null
