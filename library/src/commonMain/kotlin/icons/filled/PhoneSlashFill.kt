package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PhoneSlashFill: ImageVector
    get() {
        if (_PhoneSlashFill != null) {
            return _PhoneSlashFill!!
        }
        _PhoneSlashFill = ImageVector.Builder(
            name = "Filled.PhoneSlashFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(236.28f, 177.85f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -18.38f, 5.07f)
                lineToRelative(-24.76f, -19f)
                arcToRelative(3.43f, 3.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.53f, -0.48f)
                lineTo(109.18f, 71.62f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.55f, -6.68f)
                curveToRelative(43f, -4.62f, 87.74f, 9.12f, 119.86f, 41.24f)
                horizontalLineToRelative(0f)
                curveTo(251.58f, 126.17f, 253.51f, 155.64f, 236.28f, 177.85f)
                close()
                moveTo(53.93f, 34.62f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 42.09f, 45.38f)
                lineTo(69.71f, 75.77f)
                arcToRelative(142f, 142f, 0f, isMoreThanHalf = false, isPositiveArc = false, -45.3f, 30.41f)
                curveToRelative(-20f, 20f, -21.92f, 49.46f, -4.69f, 71.67f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.38f, 5.07f)
                lineToRelative(49f, -17.37f)
                lineToRelative(0.29f, -0.11f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.75f, -11.72f)
                lineToRelative(5.9f, -29.51f)
                arcToRelative(73.64f, 73.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.57f, -2.39f)
                lineToRelative(90.5f, 99.56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 11.84f, -10.76f)
                close()
            }
        }.build()

        return _PhoneSlashFill!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneSlashFill: ImageVector? = null
