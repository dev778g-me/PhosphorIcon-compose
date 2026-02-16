package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.CraneFill: ImageVector
    get() {
        if (_CraneFill != null) {
            return _CraneFill!!
        }
        _CraneFill = ImageVector.Builder(
            name = "Filled.CraneFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(228.12f, 17.14f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.88f, -0.2f)
                lineTo(102f, 80f)
                horizontalLineTo(32f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 96f)
                verticalLineTo(200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineToRelative(88f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineTo(168f)
                arcToRelative(7.31f, 7.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.08f, -1.05f)
                lineToRelative(0f, -0.24f)
                arcToRelative(9.6f, 9.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.22f, -1f)
                arcToRelative(0.09f, 0.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -0.05f)
                verticalLineToRelative(0f)
                arcToRelative(0.64f, 0.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -0.07f)
                lineTo(113.54f, 92f)
                lineTo(216f, 37.33f)
                verticalLineTo(160f)
                horizontalLineTo(200f)
                verticalLineToRelative(-8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(8f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineToRelative(16f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineTo(24f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 228.12f, 17.14f)
                close()
                moveTo(48f, 96f)
                verticalLineToRelative(64f)
                horizontalLineTo(32f)
                verticalLineTo(96f)
                close()
                moveTo(32f, 200f)
                horizontalLineToRelative(0f)
                verticalLineTo(176f)
                horizontalLineToRelative(88f)
                verticalLineToRelative(24f)
                close()
            }
        }.build()

        return _CraneFill!!
    }

@Suppress("ObjectPropertyName")
private var _CraneFill: ImageVector? = null
