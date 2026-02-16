package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.UserSquareFill: ImageVector
    get() {
        if (_UserSquareFill != null) {
            return _UserSquareFill!!
        }
        _UserSquareFill = ImageVector.Builder(
            name = "Filled.UserSquareFill",
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
                moveTo(224f, 48f)
                lineTo(224f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(48f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(32f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 32f)
                lineTo(208f, 32f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 48f)
                close()
                moveTo(208f, 208f)
                lineTo(208f, 48f)
                lineTo(48f, 48f)
                lineTo(48f, 208f)
                horizontalLineToRelative(3.67f)
                arcToRelative(80.58f, 80.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, 26.07f, -38.25f)
                quadToRelative(3.08f, -2.48f, 6.36f, -4.62f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.81f, 0.33f)
                arcToRelative(59.82f, 59.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 78.18f, 0f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.81f, -0.33f)
                quadToRelative(3.28f, 2.15f, 6.36f, 4.62f)
                arcTo(80.58f, 80.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, 204.33f, 208f)
                lineTo(208f, 208f)
                close()
            }
        }.build()

        return _UserSquareFill!!
    }

@Suppress("ObjectPropertyName")
private var _UserSquareFill: ImageVector? = null
