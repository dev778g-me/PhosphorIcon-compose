package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.UserCircleFill: ImageVector
    get() {
        if (_UserCircleFill != null) {
            return _UserCircleFill!!
        }
        _UserCircleFill = ImageVector.Builder(
            name = "Filled.UserCircleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(172f, 120f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = true, -44f, -44f)
                arcTo(44.05f, 44.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 172f, 120f)
                close()
                moveTo(232f, 128f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = true, 128f, 24f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 128f)
                close()
                moveTo(216f, 128f)
                arcToRelative(88.09f, 88.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, -91.47f, -87.93f)
                curveTo(77.43f, 41.89f, 39.87f, 81.12f, 40f, 128.25f)
                arcToRelative(87.65f, 87.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.24f, 58.16f)
                arcTo(79.71f, 79.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 84f, 165.1f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.83f, 0.32f)
                arcToRelative(59.83f, 59.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, 78.28f, 0f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.83f, -0.32f)
                arcToRelative(79.71f, 79.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.79f, 21.31f)
                arcTo(87.62f, 87.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 128f)
                close()
            }
        }.build()

        return _UserCircleFill!!
    }

@Suppress("ObjectPropertyName")
private var _UserCircleFill: ImageVector? = null
