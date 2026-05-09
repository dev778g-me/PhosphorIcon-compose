package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.RankingFill: ImageVector
    get() {
        if (_RankingFill != null) {
            return _RankingFill!!
        }
        _RankingFill = ImageVector.Builder(
            name = "Filled.RankingFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(240f, 200f)
                horizontalLineToRelative(-8f)
                lineTo(232f, 144f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                lineTo(176f, 128f)
                lineTo(176f, 56f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                lineTo(96f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 56f)
                lineTo(80f, 88f)
                lineTo(40f, 88f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 16f)
                verticalLineToRelative(96f)
                lineTo(16f, 200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                lineTo(240f, 216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
                moveTo(80f, 200f)
                lineTo(40f, 200f)
                lineTo(40f, 104f)
                lineTo(80f, 104f)
                close()
                moveTo(140f, 136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(124f, 107.1f)
                lineToRelative(-1.47f, 0.49f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.06f, -15.18f)
                lineToRelative(12f, -4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 140f, 96f)
                close()
                moveTo(216f, 200f)
                lineTo(176f, 200f)
                lineTo(176f, 144f)
                horizontalLineToRelative(40f)
                close()
            }
        }.build()

        return _RankingFill!!
    }

@Suppress("ObjectPropertyName")
private var _RankingFill: ImageVector? = null
