package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.BoulesFill: ImageVector
    get() {
        if (_BoulesFill != null) {
            return _BoulesFill!!
        }
        _BoulesFill = ImageVector.Builder(
            name = "Filled.BoulesFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 128f)
                curveToRelative(0f, 56.63f, -47.38f, 104f, -104f, 104f)
                arcToRelative(103.67f, 103.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, -31.52f, -4.89f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.62f, -6.65f)
                lineTo(220.46f, 94.85f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.65f, 1.62f)
                arcTo(103.69f, 103.69f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 128f)
                close()
                moveTo(215.84f, 72.39f)
                arcToRelative(103.16f, 103.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.06f, -8.56f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, -0.33f)
                lineTo(63.5f, 203.82f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.33f, 6f)
                arcToRelative(103.16f, 103.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.56f, 6.06f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -0.54f)
                lineTo(215.3f, 77.39f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 215.84f, 72.39f)
                close()
                moveTo(192.17f, 46.22f)
                arcToRelative(103.16f, 103.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.56f, -6.06f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, 0.54f)
                lineTo(40.7f, 178.62f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.54f, 5f)
                arcToRelative(103.16f, 103.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.06f, 8.56f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0.33f)
                lineTo(192.5f, 52.18f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 192.17f, 46.22f)
                close()
                moveTo(159.53f, 28.89f)
                arcTo(103.67f, 103.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                curveTo(71.38f, 24f, 24f, 71.37f, 24f, 128f)
                arcToRelative(103.69f, 103.69f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.89f, 31.53f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.65f, 1.62f)
                lineTo(161.15f, 35.54f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 159.53f, 28.89f)
                close()
            }
        }.build()

        return _BoulesFill!!
    }

@Suppress("ObjectPropertyName")
private var _BoulesFill: ImageVector? = null
