package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PentagramFill: ImageVector
    get() {
        if (_PentagramFill != null) {
            return _PentagramFill!!
        }
        _PentagramFill = ImageVector.Builder(
            name = "Filled.PentagramFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(60.18f, 129.52f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.15f, 2f)
                lineTo(22.66f, 109f)
                arcToRelative(15.78f, 15.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.82f, -18f)
                arcTo(16.33f, 16.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32.43f, 80f)
                lineTo(70.74f, 80f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.81f, 5.24f)
                close()
                moveTo(53.18f, 203f)
                arcTo(15.75f, 15.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 59f, 220.88f)
                arcToRelative(15.74f, 15.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.77f, 0f)
                lineToRelative(32.05f, -23.06f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -6.5f)
                lineTo(71.38f, 163.72f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.14f, 2f)
                close()
                moveTo(143.23f, 19.26f)
                arcToRelative(15.93f, 15.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -30.45f, -0.05f)
                lineTo(100f, 58.76f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 103.76f, 64f)
                horizontalLineToRelative(48.48f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.81f, -5.23f)
                close()
                moveTo(160f, 80f)
                lineTo(96f, 80f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.8f, 2.77f)
                lineTo(73f, 141.77f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.47f, 4.48f)
                lineToRelative(51.17f, 36.82f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.68f, 0f)
                lineToRelative(51.17f, -36.82f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.47f, -4.48f)
                lineToRelative(-19.15f, -59f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 80f)
                close()
                moveTo(239.13f, 91f)
                arcToRelative(16.33f, 16.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.59f, -11f)
                lineTo(185.26f, 80f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.81f, 5.24f)
                lineToRelative(14.37f, 44.29f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.14f, 2f)
                lineToRelative(31.41f, -22.6f)
                arcTo(15.75f, 15.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 239.16f, 91f)
                close()
                moveTo(184.58f, 163.75f)
                lineTo(146.18f, 191.38f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6.5f)
                lineToRelative(32f, 23f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 202.85f, 203f)
                lineToRelative(-12.09f, -37.27f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 184.61f, 163.72f)
                close()
            }
        }.build()

        return _PentagramFill!!
    }

@Suppress("ObjectPropertyName")
private var _PentagramFill: ImageVector? = null
