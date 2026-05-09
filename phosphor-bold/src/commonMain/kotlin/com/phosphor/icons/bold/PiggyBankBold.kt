package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.PiggyBankBold: ImageVector
    get() {
        if (_PiggyBankBold != null) {
            return _PiggyBankBold!!
        }
        _PiggyBankBold = ImageVector.Builder(
            name = "Bold.PiggyBankBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(184f, 120f)
                moveToRelative(-16f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(116f, 76f)
                lineTo(156f, 76f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(220f, 40f)
                lineTo(148f, 40f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 144f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, -24f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(224.34f, 96f)
                horizontalLineTo(228f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                horizontalLineToRelative(-8f)
                lineToRelative(-18.1f, 50.69f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.54f, 5.31f)
                horizontalLineTo(181.64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.54f, -5.31f)
                lineTo(170.29f, 200f)
                horizontalLineTo(101.71f)
                lineTo(97.9f, 210.69f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 90.36f, 216f)
                horizontalLineTo(77.64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.54f, -5.31f)
                lineTo(57f, 174f)
                arcToRelative(79.7f, 79.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -21f, -54f)
                horizontalLineToRelative(0f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, -80f)
                horizontalLineToRelative(32f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 73.44f, 48.22f)
                arcToRelative(82.22f, 82.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.9f, 7.78f)
            }
        }.build()

        return _PiggyBankBold!!
    }

@Suppress("ObjectPropertyName")
private var _PiggyBankBold: ImageVector? = null
