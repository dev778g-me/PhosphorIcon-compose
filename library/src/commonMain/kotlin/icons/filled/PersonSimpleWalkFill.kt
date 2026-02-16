package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PersonSimpleWalkFill: ImageVector
    get() {
        if (_PersonSimpleWalkFill != null) {
            return _PersonSimpleWalkFill!!
        }
        _PersonSimpleWalkFill = ImageVector.Builder(
            name = "Filled.PersonSimpleWalkFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(120f, 48f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 32f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 120f, 48f)
                close()
                moveTo(208f, 136f)
                curveToRelative(-28.64f, 0f, -41.81f, -13.3f, -55.75f, -27.37f)
                curveToRelative(-3.53f, -3.57f, -7.18f, -7.26f, -11f, -10.58f)
                curveToRelative(-37f, -32.14f, -96.22f, 22.73f, -98.72f, 25.08f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.95f, 11.66f)
                arcTo(163.88f, 163.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 84f, 113f)
                curveToRelative(13.78f, -7.38f, 25.39f, -10.23f, 34.7f, -8.58f)
                lineTo(64.66f, 228.81f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.15f, 10.52f)
                arcTo(7.84f, 7.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 240f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.34f, -4.81f)
                lineToRelative(33.59f, -77.27f)
                lineTo(144f, 180.12f)
                lineTo(144f, 232f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(160f, 176f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.35f, -6.51f)
                lineToRelative(-37.2f, -26.57f)
                lineTo(132.88f, 112f)
                curveToRelative(2.64f, 2.44f, 5.26f, 5.07f, 8f, 7.84f)
                curveTo(155.05f, 134.19f, 172.69f, 152f, 208f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
            }
        }.build()

        return _PersonSimpleWalkFill!!
    }

@Suppress("ObjectPropertyName")
private var _PersonSimpleWalkFill: ImageVector? = null
