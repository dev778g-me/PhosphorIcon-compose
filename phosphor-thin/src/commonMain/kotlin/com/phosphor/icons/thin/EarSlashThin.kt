package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.EarSlashThin: ImageVector
    get() {
        if (_EarSlashThin != null) {
            return _EarSlashThin!!
        }
        _EarSlashThin = ImageVector.Builder(
            name = "Thin.EarSlashThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 40f)
                lineTo(208f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(87f, 35.3f)
                arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 104f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 216f)
                curveToRelative(-8.07f, 9.77f, -18.34f, 16f, -32f, 16f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = true, -44f, -44f)
                curveToRelative(0f, -41.49f, -36f, -28f, -36f, -84f)
                arcTo(79.63f, 79.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 63.34f, 56.88f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(91.43f, 87.77f)
                arcTo(39.76f, 39.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 104f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(164f, 120f)
                arcToRelative(34f, 34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -16f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, -53f, -37.85f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(169.07f, 173.18f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 160f)
                arcToRelative(33.16f, 33.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.2f, -12f)
            }
        }.build()

        return _EarSlashThin!!
    }

@Suppress("ObjectPropertyName")
private var _EarSlashThin: ImageVector? = null
