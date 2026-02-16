package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.GrainsSlashFill: ImageVector
    get() {
        if (_GrainsSlashFill != null) {
            return _GrainsSlashFill!!
        }
        _GrainsSlashFill = ImageVector.Builder(
            name = "Filled.GrainsSlashFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 64f)
                verticalLineToRelative(80f)
                arcToRelative(87.66f, 87.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.45f, 30.49f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.7f, 1.27f)
                lineTo(162.52f, 130.3f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -6.16f)
                arcTo(87.36f, 87.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 112.37f)
                lineTo(200f, 72.45f)
                arcToRelative(72.33f, 72.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, -50.35f, 29.36f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 137.72f, 103f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.89f, -10.75f)
                arcToRelative(88.06f, 88.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 25f, -23.11f)
                curveTo(152.62f, 49.8f, 135.45f, 37.74f, 128f, 33.2f)
                arcToRelative(99.79f, 99.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, -23.4f, 19.94f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12f, 0.27f)
                arcToRelative(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.06f, -10.8f)
                arcToRelative(112.35f, 112.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, 31.86f, -25.76f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.16f, 0f)
                curveToRelative(1.32f, 0.66f, 30.27f, 15.43f, 44.59f, 45.15f)
                arcToRelative(87.86f, 87.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 31.74f, -6f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 64f)
                close()
                moveTo(213.92f, 210.62f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -11.84f, 10.76f)
                lineToRelative(-12.9f, -14.19f)
                arcTo(87.77f, 87.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128.52f, 232f)
                curveTo(79.83f, 232.28f, 40f, 191.51f, 40f, 142.83f)
                lineTo(40f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.09f, -8f)
                curveToRelative(1.25f, 0f, 2.48f, 0f, 3.72f, 0.09f)
                lineTo(42.08f, 45.38f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 53.92f, 34.62f)
                close()
                moveTo(136.32f, 149.05f)
                lineTo(69.18f, 75.19f)
                arcTo(71.31f, 71.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 72.44f)
                verticalLineToRelative(39.94f)
                arcToRelative(88.17f, 88.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 51f)
                arcTo(88.22f, 88.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136.32f, 149.05f)
                close()
            }
        }.build()

        return _GrainsSlashFill!!
    }

@Suppress("ObjectPropertyName")
private var _GrainsSlashFill: ImageVector? = null
