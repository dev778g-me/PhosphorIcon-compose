package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.EyeSlashFill: ImageVector
    get() {
        if (_EyeSlashFill != null) {
            return _EyeSlashFill!!
        }
        _EyeSlashFill = ImageVector.Builder(
            name = "Filled.EyeSlashFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(96.68f, 57.87f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.08f, -6.6f)
                arcTo(130.13f, 130.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 48f)
                curveToRelative(34.88f, 0f, 66.57f, 13.26f, 91.66f, 38.35f)
                curveToRelative(18.83f, 18.83f, 27.3f, 37.62f, 27.65f, 38.41f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 6.5f)
                curveToRelative(-0.35f, 0.79f, -8.82f, 19.57f, -27.65f, 38.4f)
                quadToRelative(-4.28f, 4.26f, -8.79f, 8.07f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.55f, -0.36f)
                close()
                moveTo(213.92f, 210.62f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -11.84f, 10.76f)
                lineTo(180f, 197.13f)
                arcTo(127.21f, 127.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 208f)
                curveToRelative(-34.88f, 0f, -66.57f, -13.26f, -91.66f, -38.34f)
                curveTo(17.51f, 150.83f, 9f, 132.05f, 8.69f, 131.26f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -6.5f)
                curveTo(9f, 124f, 17.51f, 105.18f, 36.34f, 86.35f)
                arcToRelative(135f, 135f, 0f, isMoreThanHalf = false, isPositiveArc = true, 25f, -19.78f)
                lineTo(42.08f, 45.38f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 53.92f, 34.62f)
                close()
                moveTo(148.43f, 162.37f)
                lineTo(95.74f, 104.37f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 52.69f, 58f)
                close()
            }
        }.build()

        return _EyeSlashFill!!
    }

@Suppress("ObjectPropertyName")
private var _EyeSlashFill: ImageVector? = null
