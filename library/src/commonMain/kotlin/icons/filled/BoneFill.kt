package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.BoneFill: ImageVector
    get() {
        if (_BoneFill != null) {
            return _BoneFill!!
        }
        _BoneFill = ImageVector.Builder(
            name = "Filled.BoneFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(231.12f, 107.72f)
                arcToRelative(35.91f, 35.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, -46.19f, 6.8f)
                arcToRelative(0.14f, 0.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.1f, 0f)
                lineToRelative(-70.35f, 70.36f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0.08f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = true, -66.37f, 22.92f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = true, 22.92f, -66.37f)
                arcToRelative(0.14f, 0.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.1f, 0f)
                lineToRelative(70.35f, -70.36f)
                reflectiveCurveToRelative(0f, 0f, 0f, -0.08f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = true, 66.37f, -22.92f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23.27f, 59.57f)
                close()
            }
        }.build()

        return _BoneFill!!
    }

@Suppress("ObjectPropertyName")
private var _BoneFill: ImageVector? = null
