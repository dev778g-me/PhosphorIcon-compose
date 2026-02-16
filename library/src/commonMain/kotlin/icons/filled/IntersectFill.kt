package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.IntersectFill: ImageVector
    get() {
        if (_IntersectFill != null) {
            return _IntersectFill!!
        }
        _IntersectFill = ImageVector.Builder(
            name = "Filled.IntersectFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(174.63f, 81.37f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = false, -93.26f, 93.26f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = false, 93.26f, -93.26f)
                close()
                moveTo(32f, 96f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 126f, -16f)
                arcTo(80.08f, 80.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80.05f, 158f)
                arcTo(64.11f, 64.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 96f)
                close()
                moveTo(160f, 224f)
                arcTo(64.11f, 64.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 98f, 176f)
                arcTo(80.08f, 80.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 98f)
                arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 224f)
                close()
            }
        }.build()

        return _IntersectFill!!
    }

@Suppress("ObjectPropertyName")
private var _IntersectFill: ImageVector? = null
