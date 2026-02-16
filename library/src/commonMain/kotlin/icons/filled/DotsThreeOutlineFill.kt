package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.DotsThreeOutlineFill: ImageVector
    get() {
        if (_DotsThreeOutlineFill != null) {
            return _DotsThreeOutlineFill!!
        }
        _DotsThreeOutlineFill = ImageVector.Builder(
            name = "Filled.DotsThreeOutlineFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(156f, 128f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, -28f, -28f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 156f, 128f)
                close()
                moveTo(48f, 100f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = false, 28f, 28f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 100f)
                close()
                moveTo(208f, 100f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = false, 28f, 28f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 100f)
                close()
            }
        }.build()

        return _DotsThreeOutlineFill!!
    }

@Suppress("ObjectPropertyName")
private var _DotsThreeOutlineFill: ImageVector? = null
