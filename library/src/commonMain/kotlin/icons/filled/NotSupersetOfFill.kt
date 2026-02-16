package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.NotSupersetOfFill: ImageVector
    get() {
        if (_NotSupersetOfFill != null) {
            return _NotSupersetOfFill!!
        }
        _NotSupersetOfFill = ImageVector.Builder(
            name = "Filled.NotSupersetOfFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(164.09f, 98.9f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 136f)
                horizontalLineTo(131.63f)
                close()
                moveTo(224f, 48f)
                verticalLineTo(208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                horizontalLineTo(48f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                verticalLineTo(48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 32f)
                horizontalLineTo(208f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 48f)
                close()
                moveTo(189.27f, 58f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.29f, 0.75f)
                lineTo(162.42f, 76.51f)
                arcTo(39.82f, 39.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 144f, 72f)
                horizontalLineTo(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(64f)
                arcToRelative(23.87f, 23.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.36f, 1.16f)
                lineToRelative(-41f, 46.84f)
                horizontalLineTo(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineTo(96.37f)
                lineTo(66f, 186.73f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10.54f)
                lineTo(89.63f, 184f)
                horizontalLineTo(176f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                horizontalLineTo(103.63f)
                lineToRelative(14f, -16f)
                horizontalLineTo(144f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 30.87f, -65.41f)
                lineTo(190f, 69.27f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 189.27f, 58f)
                close()
            }
        }.build()

        return _NotSupersetOfFill!!
    }

@Suppress("ObjectPropertyName")
private var _NotSupersetOfFill: ImageVector? = null
