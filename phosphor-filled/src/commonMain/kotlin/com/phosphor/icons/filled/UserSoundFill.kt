package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.UserSoundFill: ImageVector
    get() {
        if (_UserSoundFill != null) {
            return _UserSoundFill!!
        }
        _UserSoundFill = ImageVector.Builder(
            name = "Filled.UserSoundFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(198.13f, 202.85f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 216f)
                lineTo(24f, 216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.12f, -13.15f)
                curveToRelative(14.94f, -17.78f, 33.52f, -30.41f, 54.17f, -37.17f)
                arcToRelative(68f, 68f, 0f, isMoreThanHalf = true, isPositiveArc = true, 71.9f, 0f)
                curveTo(164.6f, 172.44f, 183.18f, 185.07f, 198.13f, 202.85f)
                close()
                moveTo(196.86f, 61.39f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.22f, 10.5f)
                arcToRelative(92.26f, 92.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 72.22f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14.72f, 6.29f)
                arcToRelative(108.36f, 108.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -84.8f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 196.86f, 61.39f)
                close()
                moveTo(236.71f, 52.85f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -14.7f, 6.3f)
                arcToRelative(124.43f, 124.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 97.7f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14.7f, 6.3f)
                arcToRelative(140.34f, 140.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -110.3f)
                close()
            }
        }.build()

        return _UserSoundFill!!
    }

@Suppress("ObjectPropertyName")
private var _UserSoundFill: ImageVector? = null
