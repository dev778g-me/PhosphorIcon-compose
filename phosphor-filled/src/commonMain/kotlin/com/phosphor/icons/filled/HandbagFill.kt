package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.HandbagFill: ImageVector
    get() {
        if (_HandbagFill != null) {
            return _HandbagFill!!
        }
        _HandbagFill = ImageVector.Builder(
            name = "Filled.HandbagFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(239.89f, 198.12f)
                lineToRelative(-14.26f, -120f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -14.12f)
                lineTo(176f, 64f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -96f, 0f)
                lineTo(46.33f, 64f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 14.12f)
                lineToRelative(-14.26f, 120f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 210.6f)
                arcToRelative(16.13f, 16.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 5.4f)
                lineTo(223.92f, 216f)
                arcTo(16.13f, 16.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 236f, 210.6f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 239.89f, 198.12f)
                close()
                moveTo(96f, 104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(80f, 88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                close()
                moveTo(128f, 32f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 32f)
                lineTo(96f, 64f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 32f)
                close()
                moveTo(176f, 104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(160f, 88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                close()
            }
        }.build()

        return _HandbagFill!!
    }

@Suppress("ObjectPropertyName")
private var _HandbagFill: ImageVector? = null
