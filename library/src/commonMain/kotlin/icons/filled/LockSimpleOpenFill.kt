package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.LockSimpleOpenFill: ImageVector
    get() {
        if (_LockSimpleOpenFill != null) {
            return _LockSimpleOpenFill!!
        }
        _LockSimpleOpenFill = ImageVector.Builder(
            name = "Filled.LockSimpleOpenFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(224f, 96f)
                verticalLineTo(208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                horizontalLineTo(48f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                verticalLineTo(96f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 80f)
                horizontalLineTo(80f)
                verticalLineTo(56f)
                arcTo(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 8f)
                curveToRelative(23.2f, 0f, 43.32f, 16.15f, 47.84f, 38.41f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -15.68f, 3.18f)
                curveTo(157.2f, 35f, 143.37f, 24f, 128f, 24f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 56f)
                verticalLineTo(80f)
                horizontalLineTo(208f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 96f)
                close()
            }
        }.build()

        return _LockSimpleOpenFill!!
    }

@Suppress("ObjectPropertyName")
private var _LockSimpleOpenFill: ImageVector? = null
